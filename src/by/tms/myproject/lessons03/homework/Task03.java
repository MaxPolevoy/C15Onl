package by.tms.myproject.lessons03.homework;

/*Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
        (Необходимо использовать Scanner)
        Программа должна выводить:
        a. Количество дней
        b. Сумму осадков за этот период
        c. Среднее количество осадков за этот период
        d. Максимальное количество дневных осадков за этот период
        Не использовать массивы!*/

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity day:  ");
        int day = sc.nextInt();
        int sumFallout = 0;
        int maxFallout = 0;

        for (int i = 0; i < day; i++) {
            int fallout = sc.nextInt();
            sumFallout = sumFallout + fallout;
            if (fallout > maxFallout) {
                maxFallout = fallout;
            }
        }
        float averageFallout=(float)sumFallout / day;

        System.out.println("Number Of Days: " + day); // Количество дней
        System.out.println("Summa Fallout: " + sumFallout); // Сумму осадков за n дней
        System.out.println("Average Fallout: " + averageFallout); // Среднее количество осадков за этот период
        System.out.println("Maximum Fallout: " + maxFallout); // Максимальное количество дневных осадков за этот период


    }
}
