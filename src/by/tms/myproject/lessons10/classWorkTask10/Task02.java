package by.tms.myproject.lessons10.classWorkTask10;

//Написать функцию, которая принимает строку и проверяет что строка не пустая.

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        System.out.println(isStringEmpty(string));
    }

    private static String isStringEmpty(String string) {
        if (string.trim().length() == 0) {
            return "Строка пустая!";
        } else {
            return "Строка не пустая: " + string;
        }
    }
}