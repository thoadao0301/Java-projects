package com.example.user_management.web;

import com.example.user_management.service.UserService;
import com.example.user_management.web.dto.UserRedistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("users")
    public UserRedistrationDto userRedistrationDto() {
        return new UserRedistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("users") UserRedistrationDto redistrationDto){
        userService.save(redistrationDto);
        return "redirect:/registration?success";
    }


}
