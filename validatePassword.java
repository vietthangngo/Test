package com.company;
import java.util.Scanner;

public class validatePassword {
    public static void validatePassword(){
        System.out.println("Please, tap password");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String pass = sc.nextLine();
            if(pass.equals("PASSword"))
                System.out.println("Password is correct");
            else
                System.out.println("Password is incorrect");
        }
    }
}
