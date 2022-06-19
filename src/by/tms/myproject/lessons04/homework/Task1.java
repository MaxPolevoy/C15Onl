package by.tms.myproject.lessons04.homework;

/*Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
Цикличность означает, что последний элемент массива становится самым первым его элементом.
Пример: {1,2,3,4,5} -> {5,1,2,3,4}*/

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        // 1. Cдвигаем элементы массива вправо на одну позицию при помощи for
        int[] array = {1, 2, 3, 4, 5};
        int last = array[array.length - 1];

        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;
        System.out.println(Arrays.toString(array));

        // 2. Cдвигаем элементы массива вправо на одну позицию при помощи System.arraycopy()
        int[] array2 = {6, 7, 8, 9, 10};
        int last2 = array2[array.length - 1];

        System.arraycopy(array2, 0, array2, 1, array2.length-1);
        array2[0] = last2;
        System.out.println(Arrays.toString(array2));
    }

}

