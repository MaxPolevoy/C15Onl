package by.tms.myproject.lessons04;

/*Написать программу, определяющую, является ли введённое целое число простым,
т.е. делится без остатка только на 1 и само на себя.*/

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "simple number" : "not simple number");
    }
}

