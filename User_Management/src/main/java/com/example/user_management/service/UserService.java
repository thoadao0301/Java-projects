package com.example.user_management.service;

import com.example.user_management.model.User;
import com.example.user_management.web.dto.UserRedistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRedistrationDto redistrationDto);
}
