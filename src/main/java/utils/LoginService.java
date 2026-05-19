/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import model.entity.User;

/**
 *
 * @author neils
 */
public class LoginService {

    private List<User> validUsers;

    public LoginService() {
        validUsers = new ArrayList<>();
        validUsers.add(new User("User", "12345678"));
    }

    public boolean authenticate(String username, String password) {
        for (User user : validUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
