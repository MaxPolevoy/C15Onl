package by.tms.myproject.lessons01.classwork;

/*Написать функцию, которая принимает букву русского алфавита и целое число. На выходе функции должен быть символ,
которые смещен вправо (больше) на переданное число от переданной буквы*/

public class RightShift {

    public static void main(String[] args) {
        char symbol = 'Q';
        int number = 5;
        char result = (char) ((int)symbol >> number);
        System.out.println(result);
    }
}
