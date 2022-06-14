package by.tms.myproject.lessons01.classwork;

/*Задано количество секунд.
Вывести на экран количество минут (вначале целое, потом десятичное).*/

public class NumberMinutes {

    public static void main(String[] args) {
        int second = 555;
        int oneMinut = 60;
        double minute = second / (double)oneMinut;
        System.out.println("minute: " + second/60);
        System.out.println("minute: " + second/60d);
        System.out.println("minute: " + minute);
    }
}
