package com.company;

//de importat login

import java.util.*;
import java.io.*;
import com.company.Login;

public class Notepad {


    public static void main (String[]args){


        DoLogin dologin = new DoLogin();
        dologin.readLoginList();

        // daca searchul e ok apel altfel stai aici

        boolean isLogin = dologin.loginUntilSuccess();
        if(isLogin) {
            launchProgram();

        }




    }


    private static void launchProgram() {

        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
