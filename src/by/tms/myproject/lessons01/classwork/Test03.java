package by.tms.myproject.lessons01.classwork;

/*Написать программу, которая определяет,
является ли последняя цифра заданного целого  числа – цифрой 3*/

public class Test03 {
    public static void main(String[] args) {
        int value = 555;
        boolean result = value % 10 == 3;
        System.out.println(result);

    }
}
