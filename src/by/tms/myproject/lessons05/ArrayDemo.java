package by.tms.myproject.lessons05;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        numbers[numbers.length - 1] = 0;
        String arrayString = Arrays.toString(numbers);
//        System.out.println(arrayString);

        for (int myNumber : numbers) {
            myNumber = myNumber - 3;
//            System.out.println(myNumber);
        }
//        System.out.println(Arrays.toString(numbers));

        int[] arrayToSort = {1, 3, 2, 2, 5, -8, 0, 11, -10, 4};
        System.out.println(Arrays.toString(arrayToSort));
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.binarySearch(arrayToSort, 3));
    }
}
