package controllers;

import models.User;

/**
 * Created by zyw on 2016/6/23.
 */
public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        return User.connect(username, password) != null;
    }

//    static void onDisconnected() {
//        Application.index();
//    }
//
//    static void onAuthenticated() {
//        Admin.index();
//    }

    static boolean check(String profile) {
        if ("admin".equals(profile)) {
            System.out.println(connected());
            return User.find("byEmail", connected()).<User>first().isAdmin;
        }
        return false;
    }
}
