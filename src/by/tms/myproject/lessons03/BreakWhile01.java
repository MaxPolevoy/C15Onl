package by.tms.myproject.lessons03;

public class BreakWhile01 {
    public static void main(String[] args) {
        int i = 0, n = 100;

        while (i < n) {
            if (i == 10) {
                break;
            }
            System.out.println("i: " + i++);
        }
        System.out.println("Cycle completed.");
    }
}
