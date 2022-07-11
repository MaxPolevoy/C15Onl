package by.tms.myproject.lessons10.classWorkTask10;

// Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
// в формате "Ф.И.О".
// Учесть, что входные параметры могут быть в любом регистре,
// а результирующая строка должна быть в верхнем.

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Фамилию:");
        char getOneLetterLastName = sc.nextLine().charAt(0);

        System.out.println("Введите Имя:");
        char getOneLetterName = sc.nextLine().charAt(0);

        System.out.println("Введите отчество:");
        char getOneLetterSurName = sc.nextLine().charAt(0);

        System.out.println(getInitials(getOneLetterLastName, getOneLetterName, getOneLetterSurName));
    }

    private static StringBuilder getInitials(char getOneLetterLastName, char getOneLetterName, char getOneLetterSurName) {
        StringBuilder initials = new StringBuilder();
        initials.append(Character.toUpperCase(getOneLetterLastName)).append(".").append(Character.toUpperCase(getOneLetterName)).append(".").append(Character.toUpperCase(getOneLetterSurName));
        return initials;
    }
}
