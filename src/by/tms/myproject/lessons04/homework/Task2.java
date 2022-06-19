package by.tms.myproject.lessons04.homework;

/*Написать программу, удаляющую все целые числа из массива, которые равны тому, что ввёл пользователь.
В результате должен получиться новый массив, в котором нет заданных элементов.
Распечатать полученный массив.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] newArr = null;

        Scanner sc =new Scanner(System.in);
        int element = sc.nextInt();

        System.out.println("Original Array is: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                newArr = new int[array.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = array[index];
                }
                for (int j = i; j < array.length-1 ; j++) {
                    newArr[j] = array[j + 1];
                }
            }
        }
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}