package com.example.mobilelele.service;

import com.example.mobilelele.model.dtos.UserLoginDTO;
import com.example.mobilelele.model.dtos.UserRegisterDTO;
import com.example.mobilelele.model.entities.UserEntity;
import com.example.mobilelele.repositories.UserRepository;
import com.example.mobilelele.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private CurrentUser currentUser;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, CurrentUser currentUser, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean login(UserLoginDTO userLoginDTO){
        Optional<UserEntity> optionalUser =
                userRepository.findByUsername(userLoginDTO.getUsername());

        if(optionalUser.isEmpty()){
            LOGGER.debug("User not found: [{}]", userLoginDTO.getUsername());
            return false;
        }

        String rawPassword = userLoginDTO.getPassword();
        String hashedPassword = optionalUser.get().getPassword();

        boolean success = passwordEncoder.matches(rawPassword, hashedPassword);


        if(success){
            currentUser.setLoggedIn(true)
                    .setName(optionalUser.get().getFirstName() + " " + optionalUser.get().getLastName());

        } else{
            logout();
        }

        return success;
    }



    public void logout(){
        currentUser.clear();
    }

    public void register(UserRegisterDTO userRegisterDTO){

        if(userRegisterDTO.getPassword() != userRegisterDTO.getConfirmPassword()){
            // todo
        }

        UserEntity user = new UserEntity()
                .setFirstName(userRegisterDTO.getFirstName())
                .setLastName(userRegisterDTO.getLastName())
                .setUsername(userRegisterDTO.getUsername())
                .setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        userRepository.save(user);

    }


}
