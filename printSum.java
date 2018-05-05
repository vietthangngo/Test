package com.company;
import java.util.Scanner;

public class printSum {
    public static void printSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {  //подсчитать сумму чисел
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);
        while (value != 0) {   //подсчитать произведения чисел
        com *= value % 10;
        value = value / 10;
    }
        System.out.println("Произведение введённых чисел: " + com);
    }

}
