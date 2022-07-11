package by.tms.myproject.lessons10.homework;

// Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();

        StringBuilder reverse = new StringBuilder(string).reverse();

        String stringReverse = reverse.toString();
        if (string.length() == 0) {
            System.out.println("Вы не ввели строку");

        } else if (string.equals(stringReverse)) {
            System.out.println("Sting " + string + " palindrome!");
        } else
            System.out.println("Sting " + string + " not palindrome!");

    }
}
