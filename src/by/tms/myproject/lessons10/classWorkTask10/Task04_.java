package by.tms.myproject.lessons10.classWorkTask10;

import java.util.Scanner;

public class Task04_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Фамилию:");
        String getOneLetterLastName = sc.nextLine();

        System.out.println("Введите Имя:");
        String getOneLetterName = sc.nextLine();

        System.out.println("Введите отчество:");
        String getOneLetterSurName = sc.nextLine();

        System.out.println(getInitials(getOneLetterLastName, getOneLetterName, getOneLetterSurName));
    }

    private static StringBuilder getInitials(String getOneLetterLastName, String getOneLetterName, String getOneLetterSurName) {
        StringBuilder initials = new StringBuilder();
        return initials.append(getOneLetterLastName.toUpperCase().charAt(0)).append(".").append(getOneLetterName.toUpperCase().charAt(0)).append(".").append(getOneLetterSurName.toUpperCase().charAt(0));
    }
}