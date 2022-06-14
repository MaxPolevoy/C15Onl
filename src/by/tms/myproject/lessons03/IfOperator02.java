package by.tms.myproject.lessons03;

import java.util.Scanner;

public class IfOperator02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }else if(month == 6 || month == 7 || month == 8){
            System.out.println("Samer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Other");
        }else
            System.out.println("Not month");
    }
}
