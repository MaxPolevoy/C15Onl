package by.tms.myproject.lessons04.homework;

/*
Написать программу, которая преобразовывает двумерный массив
в одномерный массив со всеми элементами двумерного
*/

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        System.out.print(Arrays.deepToString(array));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int[] array2 = array[i];
            for (int strArray2 : array2) {
                System.out.print(strArray2 + " ");
            }
        }
    }
}
