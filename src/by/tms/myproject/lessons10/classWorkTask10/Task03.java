package by.tms.myproject.lessons10.classWorkTask10;

// Написать функцию, принимающую 2 параметра:
// строку и слово - и возвращающую true,
// если строка начинается и заканчивается этим словом.

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();
        System.out.println("Введите слово:");
        String word = sc.nextLine();

        System.out.println(isStringTrue(string, word));
    }

    private static boolean isStringTrue(String string, String word) {
        if ((string == null || string.length() == 0) && (word == null || word.length() == 0)) {
            return false;
        } else
            return string.startsWith(word) && string.endsWith(word);
    }
}