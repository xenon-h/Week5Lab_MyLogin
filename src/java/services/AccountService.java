/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author 759005
 */
public class AccountService {

    public User login(String username, String password) {
        User user = null;
        if ( (username.contentEquals("abe") || username.contentEquals("barb")) && password.contentEquals("password")) {
            user = new User(username);
        }
        return user;

    }

}
