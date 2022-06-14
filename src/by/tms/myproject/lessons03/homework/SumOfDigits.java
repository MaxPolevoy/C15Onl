package by.tms.myproject.lessons03.homework;

/*Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.*/

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number:  ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {   // цикл выполняется пока переменная variable не равна 0
            sum += number % 10; // суммируем остаток от деления
            number /= 10;       // деление с присваиванием
        }
        System.out.println("while    - sum: " + sum);

        do {
            sum += number % 10; // суммируем остаток от деления
            number /= 10;       // деление с присваиванием
        }
        while (number != 0);
        System.out.println("do while - sum: " + sum);


        for (; number != 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("for      - sum: " + sum);

    }
}
