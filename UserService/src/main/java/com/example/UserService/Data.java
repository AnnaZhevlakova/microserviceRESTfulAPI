package com.example.UserService;

import com.example.UserService.models.User;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<User> testUser;

    static {
        testUser = new ArrayList<User>();
        testUser.add(new User(1, "Катя", "Удмуртская 96", "+79829632534", "vdhshc@"));
        testUser.add(new User(2, "Света", "Союзная 125", "+79829632654", "dncka@"));
        testUser.add(new User(3, "Виктор", "Советская 45", "+7982962958", "dcdksm@"));

    }

    public static List<User> getTestUser() {
        return testUser;
    }


}
