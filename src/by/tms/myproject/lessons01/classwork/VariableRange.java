package by.tms.myproject.lessons01.classwork;

/*Определить входит ли переменная Х в диапазон от 10 до 100*/

public class VariableRange {

    public static void main(String[] args) {
        int variable = 8;
        boolean result = 10 < variable && variable < 100;
        System.out.println(result);
    }
}
