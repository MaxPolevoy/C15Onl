package by.tms.myproject.lessons03;

import java.util.Scanner;

public class SwitchOperator02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Samer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Other";
                break;
            default:
                season = "Not month";
        }
        System.out.println("Month: " +season +".");
    }
}
