package by.tms.myproject.lessons03;

import java.util.Scanner;

public class CyclesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();

//        for(int i = 0; i - 3 < variable % 2; i+=2){
//            System.out.println("Iteration number:" + i);
//        }

        int i = 0;
        for(;i - 3 < variable % 2 ;){
            System.out.println("Iteration number:" + i);
            i+=2;
        }

        //  for(int i = 0; i < variable; i++){
//            if(i % 2 == 0){
//                System.out.println("Iteration number:" + i);
//            }
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println("Iteration number:" + i);
//            if(i == 7){
//                break;
//            }
//        }
//        int i = 5;
//        while (i < variable){
//            System.out.println("Iteration number:" + i);
//            i++;
//        }

//        do {
//            System.out.println("Iteration number:" + i);
//        } while (i < variable);


    }
}

