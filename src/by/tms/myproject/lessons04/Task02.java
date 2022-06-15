package by.tms.myproject.lessons04;

/*Напишите программу которая выводит на консоль таблицу умножения.*/

public class Task02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }

}
