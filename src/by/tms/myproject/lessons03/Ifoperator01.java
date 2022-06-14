package by.tms.myproject.lessons03;

import java.util.Scanner;

public class Ifoperator01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       int namber = sc.nextInt();
//        if (namber % 2 != 0) {
//            System.out.println("Number no even: " + namber);
//        }

        if (sc.hasNextInt()) {
            int namber = sc.nextInt();
            CompareNumber(namber);
        }else
            System.out.println("Integer not integer");
    }

    private static void CompareNumber(int namber) {
        if (0 < namber && namber < 10) {
            System.out.println("Positive number less 10: " + namber);
        } else
            System.out.println("Positive number more than 10, or negative: " + namber);
    }
}
