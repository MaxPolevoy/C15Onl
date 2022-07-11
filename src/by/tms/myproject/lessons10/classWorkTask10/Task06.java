package by.tms.myproject.lessons10.classWorkTask10;

// Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//- Распечатать последний символ строки.
//- Проверить, заканчивается ли ваша строка подстрокой “!!!”.
//- Проверить, начинается ли ваша строка подстрокой “I like”.
//- Проверить, содержит ли ваша строка подстроку “Java”.
//- Найти позицию подстроки “Java” в строке “I like Java!!!”.
//- Заменить все символы “а” на “о”.
//- Преобразуйте строку к верхнему регистру.
//- Преобразуйте строку к нижнему регистру.
//- Вырезать строку Java .

public class Task06 {

    public static void main(String[] args) {


        String string = "I like Java!!!";

        String stringEnd = "!!!"; //- Проверить, заканчивается ли ваша строка подстрокой “!!!”.
        String stringStart = "I like"; //- Проверить, начинается ли ваша строка подстрокой “I like”.
        String subString = "Java"; //Проверить, содержит ли ваша строка подстроку “Java”.

        System.out.println("Last char string " + " - " + getLast(string));
        System.out.println("String finish " + stringEnd + " - " + isVerificationStringEnd(string, stringEnd));
        System.out.println("String start " + stringStart + " - " + isVerificationStringStart(string, stringStart));
        System.out.println("Substring " + subString + " - " + isVerificationSubSting(string, subString));
        System.out.println("Position substring " + subString + " - " + getPosition(string, subString));
        System.out.println("Replace symbol 'a' on 'o' " + " - " + replaceSymbol(string));
        System.out.println("Upp Case String " + " - " + getToUpperCase(string));
        System.out.println("Lower Case String " + " - " + getToLowerCase(string));
        System.out.println("Lower Case String " + " - " + getСutString(string, subString));
    }

    //- Распечатать последний символ строки.
    protected static char getLast(String string) {

        return string.charAt(string.length() - 1);
        //  return string.toCharArray()[string.length() - 1];
    }

    //- Проверить, заканчивается ли ваша строка подстрокой “!!!”.
    protected static boolean isVerificationStringEnd(String string, String stringEnd) {

        return string.endsWith(stringEnd);
    }

    //- Проверить, начинается ли ваша строка подстрокой “I like”.
    protected static boolean isVerificationStringStart(String string, String stringStart) {

        return string.startsWith(stringStart);
    }

    //- Проверить, содержит ли ваша строка подстроку “Java”.
    protected static boolean isVerificationSubSting(String string, String subString) {

        return string.contains(subString);
    }

    //- Найти позицию подстроки “Java” в строке “I like Java!!!”.
    protected static int getPosition(String string, String subString) {
        return string.indexOf(subString);
    }

    ////- Заменить все символы “а” на “о”.
    protected static String replaceSymbol(String string) {
        return string.replace("a", "o");
    }

    //- Преобразуйте строку к верхнему регистру.
    protected static String getToUpperCase(String string) {
        return string.toUpperCase();
    }

    //- Преобразуйте строку к нижнему регистру.
    protected static String getToLowerCase(String string) {
        return string.toLowerCase();
    }

    //- Вырезать строку Java.
    protected static String getСutString(String string, String subString) {

        return string.replace(subString,"");
    }
}
