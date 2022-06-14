package by.tms.myproject.lessons03;

public class ForOperator {

    public static void main(String[] args) {

//        for (int i = 1, j = 4; i < j; i++, j--) {
//            System.out.println(i + " " + " " + j);
//            System.out.println();
//        }
//        char j = 'h';
//        for (int i = 0; i < 5; i++) {
//            System.out.println(j++);
//        }
        for (int i = 4; i <= 5; i++) {
            for (int j = 0; j < 6; j = j + 2) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
