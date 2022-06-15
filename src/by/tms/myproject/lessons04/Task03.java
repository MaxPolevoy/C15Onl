package by.tms.myproject.lessons04;

/*Написать программу высчитывающую факториал введённого целого числа.*/

public class Task03 {

    public static void main(String[] args) {

        int factorial = 1;

        for (int i = 1; i < 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial: " + factorial);
    }
}
