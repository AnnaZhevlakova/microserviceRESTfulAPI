package com.example.BFFService.service;

import com.example.BFFService.models.UserResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("request")
@Service
public class UserService {
    public UserResponse getUser(long userId) {
        return null;
    }
}
