package by.tms.myproject.lessons05;

import java.util.Scanner;

public class RainTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во дней:");
        int daysCount = scanner.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 1; i <= daysCount; i++) {
            System.out.println("Введите кол-во осадков за день №" + i);
            int dayCount = scanner.nextInt();
            if(dayCount > max){
                max = dayCount;
            }
            sum += dayCount;
        }
        double avg =  (double) sum / daysCount;

        System.out.println("Кол-во дней:" + daysCount);
        System.out.println("Сумма осадков:" + sum);
        System.out.println("Среднее кол-во осадков:" + avg);
        System.out.println("Максимальное кол-во осадков:" + max);
    }
}
