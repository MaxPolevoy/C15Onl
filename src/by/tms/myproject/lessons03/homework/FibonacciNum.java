package by.tms.myproject.lessons03.homework;

/*Написать программу, вычисляющую и отображающую все числа Фибоначчи
меньше введённого пользователем целого числа.*/

import java.util.Scanner;

public class FibonacciNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number:  ");
        int n = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            System.out.print(result + " ");
        }
    }
}
