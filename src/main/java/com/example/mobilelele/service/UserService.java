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
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final CurrentUser currentUser;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, CurrentUser currentUser, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
    }

    public void login(UserLoginDTO userLoginDTO) {

        Optional<UserEntity> optionalUser =
                userRepository.findByEmail(userLoginDTO.getEmail());

        if (optionalUser.isEmpty()) {
            LOGGER.info("User not found: [{}]", userLoginDTO.getEmail());
            return;
        }

        String rawPassword = userLoginDTO.getPassword();
        String hashedPassword = optionalUser.get().getPassword();

        boolean success = passwordEncoder.matches(rawPassword, hashedPassword);


        if (success) {
            currentUser.setName(optionalUser.get().getFirstName() + " " + optionalUser.get().getLastName());
        } else {
            logout();
        }

    }


    public void logout() {
        currentUser.clear();
    }

    public void register(UserRegisterDTO userRegisterDTO) {


        UserEntity user = new UserEntity()
                .setFirstName(userRegisterDTO.getFirstName())
                .setLastName(userRegisterDTO.getLastName())
                .setEmail(userRegisterDTO.getEmail())
                .setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        userRepository.save(user);

    }



}
