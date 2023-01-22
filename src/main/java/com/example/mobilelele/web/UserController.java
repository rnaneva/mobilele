package com.example.mobilelele.web;

import com.example.mobilelele.model.dtos.banding.UserRegisterFormDto;
import com.example.mobilelele.service.userRole.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController {
    private UserRoleService userRoleService;

    @Autowired
    public UserController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {
        modelAndView.addObject("role", "USER");
        return super.view("auth-register", modelAndView);
    }

    public ModelAndView postRegister(UserRegisterFormDto userRegisterFormDto){
        return super.redirect("auth-login");
    }


}
