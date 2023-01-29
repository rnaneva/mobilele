package com.example.mobilelele.web;


import com.example.mobilelele.model.dtos.UserLoginDTO;
import com.example.mobilelele.model.dtos.UserRegisterDTO;
import com.example.mobilelele.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper;

    public UserController(ModelMapper modelMapper, UserService userService) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/login")
    public String login(){
        return "auth-login";
    }

    @GetMapping("/logout")
    public String logout() {
        userService.logout();
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(){
        return "auth-register";
    }

    @PostMapping("/login")
    private String login(UserLoginDTO userLoginDTO){
        userService.login(userLoginDTO);
        return "redirect:/";
    }

    @PostMapping("/register")
    private String register(UserRegisterDTO userRegisterDTO){
        userService.register(userRegisterDTO);

        return "redirect:/login";
    }





}
