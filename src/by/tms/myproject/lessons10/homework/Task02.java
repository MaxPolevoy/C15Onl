package by.tms.myproject.lessons10.homework;

//  Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
//  Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
//  Например CM == 900; IX == 9.
//  Соответствие:
//  M 1000
//  D 500
//  C 100
//  L 50
//  X 10
//  V 5
//  I 1


public class Task02 {
    public static void main(String[] args) {
        System.out.println(romanInDecimal("IV"));
    }

    private static int letterInNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static int romanInDecimal(String roman) {
        int integerValue = 0;

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            int number = letterInNumber(ch);
            if (number == -1) {
                throw new NumberFormatException("Недопустимый формат");
            }

            if (i + 1 < roman.length()) {
                int nextNumber = letterInNumber(roman.charAt(i + 1));
                if (nextNumber > number) {
                    integerValue += (nextNumber - number);
                    i++;
                } else {
                    integerValue += number;
                }
            } else {
                integerValue += number;

            }
        }
        return integerValue;
    }
}