package com.company;

import java.util.Scanner;

public class Arrays {

    public static void A(){
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }
    }
    public static void B(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        for (int i = 0; i < size; i++)
            if (sourceNumbers[i] % 2 != 0)
                System.out.println("Нечётное число:" + sourceNumbers[i]);
            else if (sourceNumbers[i] % 2 == 0)
                System.out.println("Чётное число:" + sourceNumbers[i]);

    }
    public static void C(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        int min = sourceNumbers[0];
        for (int i = 0; i < size; i++) {
            if (min > sourceNumbers[i])
                min = sourceNumbers[i];
        }
        System.out.println("Минимльное число:" + min);
    }
    public static void D(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        int max = sourceNumbers[0];
        for (int i = 0; i < size; i++) {
            if (max < sourceNumbers[i])
                max = sourceNumbers[i];
        }
        System.out.println("Максимальное число:" + max);
    }
    public static void E(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        for (int i = 0; i < size; i++)
            if ((sourceNumbers[i] % 3 == 0) || (sourceNumbers[i] % 9 == 0)) // для задания достаточно 1й проверки
                System.out.println("Число, которое делится на 3 или 9: " + sourceNumbers[i]);
    }
    public static void F(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        for (int i = 0; i < size; i++)
            if ((sourceNumbers[i] % 5 == 0) && (sourceNumbers[i] % 7 == 0))  // (5 AND 7) для задания достаточно только 1й if
                System.out.println("Число, которое делится на 5 и 7: " + sourceNumbers[i]);
    }
    public static void G(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        int a = 0, b = 0, c = 0;
        for (int j = 0; j < size; j++)
            if ((sourceNumbers[j] > 99) && (sourceNumbers[j] < 1000)) {
                a = sourceNumbers[j] / 10 / 10;
                b = sourceNumbers[j] / 10 % 10;
                c = sourceNumbers[j] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + sourceNumbers[j]);
            }
    }
    public static void K(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        int a1 = 0, b1 = 0;
        for (int j = 0; j < size; j++)
            if ((sourceNumbers[j] > 99999) && (sourceNumbers[j] < 1000000)) {

                a1 = sourceNumbers[j] / 1000; // выделение 1й 3ки чисел
                b1 = sourceNumbers[j] % 1000; // выделение 2й 3ки чисел

                int sum = 0;
                int sum1 = 0;
                while (a1 != 0) {  //подсчитать сумму 1й тройки чисел
                    sum = sum + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {  //подсчитать сумму 2й тройки чисел
                    sum1 = sum1 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum == sum1) {
                    System.out.println("Счастливое число: " + sourceNumbers[j]);
                }
            }
    }
    public static void taskSix(){
        Arrays.A();
        Arrays.B();
        Arrays.C();
        Arrays.D();
        Arrays.E();
        Arrays.F();
        Arrays.G();
        Arrays.K();
    }

}
