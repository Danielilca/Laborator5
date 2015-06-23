package com.company;

/**
 * Created by Mihai on 6/13/2015.
 */
public class Login {
    String user;
    String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


   // Login() {}

    Login(String u, String p) {
        System.out.println("constructor running");
        user=u;
        password=p;
    }
}
