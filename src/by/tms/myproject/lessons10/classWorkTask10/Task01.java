package by.tms.myproject.lessons10.classWorkTask10;

// Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
// второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

public class Task01 {

    public static void main(String[] args) {

        long strStar = System.nanoTime();
        String str = "";
        for (int i = 0; i < 100_000; i++) {
            str = str + i;
        }
        long strEnd = System.nanoTime();
        System.out.println((strEnd - strStar)/1_000_000_000);

        long str1Star = System.nanoTime();
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            str1.append(i);
        }
        str1.toString();
        long str1End = System.nanoTime();
        System.out.println((str1End - str1Star)/1_000_000_000);
    }
}
