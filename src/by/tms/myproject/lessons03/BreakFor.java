package by.tms.myproject.lessons03;

public class BreakFor {

    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.print("receive " + i + " : ");
//            for (int j = 0; j < 100; j++) {
//                if (j == 10) {
//                    break;
//                }
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Cycles completed");


//        outer:
//        for (int i = 0; i < 3; i++) {
//            System.out.print("receive " + i + " : ");
//            for (int j = 0; j < 100; j++) {
//                if (j == 10) {
//                    break outer; // выход из обоих циклов
//                }
//                System.out.print(j + " ");
//            }
//            System.out.println("This line will not be displayed");
//        }


        foreach:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
                if (j == 3 && k == 1) break foreach;
                if (j == 0 || j == 2) break;
            }
        }
    }
}
