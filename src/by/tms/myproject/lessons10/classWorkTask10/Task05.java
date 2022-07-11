package by.tms.myproject.lessons10.classWorkTask10;

// Подсчитать количество всех точек, запятых и восклицательных знаков в строке.

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();

        int dot = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.') {
                dot++;
            }
        }

        int comma = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ',') {
                comma++;
            }
        }

        int exclamationPoint = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '!') {
                exclamationPoint++;
            }
        }

        System.out.println(". " + dot);
        System.out.println(", " + comma);
        System.out.println("! " + exclamationPoint);
        System.out.println("Sum all punctuation: " + (dot + comma + exclamationPoint));

    }
}
