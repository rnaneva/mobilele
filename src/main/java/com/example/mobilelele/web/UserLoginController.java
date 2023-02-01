package com.example.mobilelele.web;


import com.example.mobilelele.model.dtos.UserLoginDTO;
import com.example.mobilelele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserLoginController {

    private final UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/login")
    public String login(){
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(Model model, UserLoginDTO userLoginDTO){
        model.addAttribute("password", userLoginDTO.getPassword())
                        .addAttribute("username", userLoginDTO.getEmail());
        userService.login(userLoginDTO);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        userService.logout();
        return "redirect:/";
    }




}
