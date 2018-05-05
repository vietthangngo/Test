package com.company;

import java.util.Scanner;

public class reverseArgs {

    public static void reverseArgs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, tap arguments in row: ");
        int a= scanner.nextInt();
        int b = 0;
        while (a != 0) {
            b = b * 10 + (a % 10);
            a = a / 10;
        }
        System.out.print("Arguments: " + b);
        System.out.println();
    }


}
