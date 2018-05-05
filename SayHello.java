package com.company;

import java.util.Scanner;

public class SayHello {
    public static void sayHello(){
        System.out.println("Please, tap your name");
        String name = new String();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            name = sc.nextLine();
        }
        System.out.println("Hello, "+name+"!");
    }
}
