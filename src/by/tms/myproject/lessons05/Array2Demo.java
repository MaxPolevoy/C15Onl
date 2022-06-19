package by.tms.myproject.lessons05;

import java.util.Arrays;

public class Array2Demo {

    public static void main(String[] args) {
        int [][] numbers = new int[10][10];

        /*
        {       i=0     i=1     i=2
            {1,2,3}, {1,2,3,4,5}, {1,2,3}
                    j= 0..2
        }
         */

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i * j;
            }
        }
        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }
//        System.out.println(Arrays.toString(numbers));

    }
}
