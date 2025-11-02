package com.example.UserService.services;

import com.example.UserService.models.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("request")
@Service
public class UserService {
    public User getUser(long userId) {
        return new User(1, "test", "test", "test", "test");
    }


}
