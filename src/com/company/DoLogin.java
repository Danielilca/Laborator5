package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mihai on 6/13/2015.
 */
public class DoLogin {
    ArrayList<Login> loginlist=new ArrayList<Login>();

    DoLogin() {

            }

 public  void readLoginList(){
     try{
     BufferedReader bReader = new BufferedReader(new FileReader("text.txt"));
     String line=null;
     while((line= bReader.readLine())!=null)
     {
         String[] userandpass=line.split("\\;");
         String user=userandpass[0];
         String password=userandpass[1];
         loginlist.add(new Login(user,password));
         }} catch (IOException e) {
         System.out.println(e.getMessage()+"the file not found");
     }

 }

    public boolean login() {
        boolean found=false;

            Scanner sc = new Scanner(System.in);
            String user;
            System.out.print("enter username=");
            user=sc.next();
            String pwd;
            System.out.print("enter pwd=");
            pwd=sc.next();

            if(search(user,pwd,loginlist))
              found=true;

            System.out.println("n ai ghicit");

return found;



    }


    public boolean loginUntilSuccess() {
        boolean found=false;

        do {
            Scanner sc = new Scanner(System.in);
            String user;
            System.out.print("enter username=");
            user = sc.next();
            String pwd;
            System.out.print("enter pwd=");
            pwd = sc.next();

            if (search(user, pwd, loginlist)) {
                found = true;
                break;
            }
            System.out.println("n-ai ghicit");

        }
        while(true);

        return found;



    }

    private static boolean search(String u, String p, ArrayList<Login> l) {
        boolean found=false;
        for(Login i : l){

            if(u.equals(i.getUser()) && p.equals(i.getPassword())) {
                found=true;
                break;
            }
        }
        return found;
    }





}
