package com.example.UserService.services;

import com.example.UserService.Data;
import com.example.UserService.models.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("request")
@Service
public class UserService {
    public User getUser(long userId) {
        var result = Data.getTestUser().stream().filter(x -> x.getId() == userId)
                .findFirst()
                .orElseGet(() -> null);
        return result;
    }


}
