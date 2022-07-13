package by.tms.myproject.lessons10.classWorkTask10.utils;

public final class StringUtils {

    public static final String EMPTY_STRING = "";
    public static final int FIRST_INDEX = 0;
    public static final char DOT_CHAR = '.';

    private StringUtils() {
    }

    //Написать функцию, которая принимает строку и проверяет что строка не пустая.
    public static boolean isStringEmpty(String str) {

        // return !(str == null && str.trim().length() == 0); // инверсия меняет тру на фолс
        return str == null && str.trim().length() == FIRST_INDEX;
    }

    // Написать функцию, принимающую 2 параметра:
// строку и слово - и возвращающую true,
// если строка начинается и заканчивается этим словом.
    public static boolean isStartsAndEndsWithWord(String string, String word) {
        return string != null && word != null && string.startsWith(word) && string.endsWith(word);
    }


// Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
// в формате "Ф.И.О".
// Учесть, что входные параметры могут быть в любом регистре,
// а результирующая строка должна быть в верхнем.

    private static String getInitials(String fisttName, String lastName, String middleSurName) {
        if (isEmpty(fisttName) || isEmpty(lastName) || isEmpty(middleSurName)) {
            return EMPTY_STRING;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(fisttName.charAt(FIRST_INDEX)).append(DOT_CHAR).
                append(lastName.charAt(FIRST_INDEX)).append(DOT_CHAR).
                append(middleSurName.charAt(FIRST_INDEX));
        return builder.toString().toUpperCase();
    }

    public static boolean isEmpty(String string) {
        return string == null || string.trim().length() == FIRST_INDEX;
    }

    // Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
    public static int getNumberAllDotsCommasExclamationPoints(String string) {
        if (string == null) {
            return 0;
        }
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            char specialSymbol = string.charAt(i);
            if (specialSymbol == ',' || specialSymbol == DOT_CHAR || specialSymbol == '!') {
                counter++;

            }
        }
        return counter;
    }

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

}
