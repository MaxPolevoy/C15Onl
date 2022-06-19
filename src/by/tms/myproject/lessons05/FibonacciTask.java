package by.tms.myproject.lessons05;

import java.util.Scanner;

public class FibonacciTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToStop = scanner.nextInt();

        int firstFib = 0;
        int secondFib = 1;
        int thirdFib = firstFib + secondFib;

        while (thirdFib < numberToStop){
            System.out.print(thirdFib + " ");
            firstFib = secondFib;
            secondFib = thirdFib;
            thirdFib = firstFib + secondFib;
        }

    }
}
