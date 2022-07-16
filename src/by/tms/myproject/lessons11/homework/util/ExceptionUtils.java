package by.tms.myproject.lessons11.homework.util;

// Создать утилитный класс, в котором должны быть методы воспроизводящие следующие
// исключительные ситуации (у методов должны быть понятные названия):


import by.tms.myproject.lessons11.homework.MyClassException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public final class ExceptionUtils {

    private ExceptionUtils() {
    }

    // Генерация NullPointerException. Отловите возникшее исключение и выведите stackTrace.
    public static void generationNullPointerException(Object object) {
        System.out.println(object.toString());
    }

    // Написать метод, который создаст, а затем отловит ArrayIndexOutOfBoundsException
    // и корректно его обработает.
    public static void generationArrayIndexOutOfBoundsException() {

        int[] array = {1, 2, 3, 4, 5};
        array[-1] = 10;

    }

    // Создать метод, выбрасывается исключение IllegalArgumentException.
    // Вызвать этот метод и отловить исключение. Вывести в консоль сообщение этого исключения.
    public static void generationIllegalAccessError(Object myParameter) throws Exception {
        if (myParameter == null) {
            throw new IllegalAccessException("Параметр 'myParameter' не может быть null");
        }
    }


// Создать метод выбрасывающий одно из существующих в JDK исключений,
// отловить его и выбросить своё собственное, указав в качестве причины отловленное
// (тип своего исключения должен соответствовать типу исключения из JDK –
// проверяемое или не проверяемое).

    public static void getFileInputStream() throws MyClassException {

        try {
            FileInputStream file = new FileInputStream("C://Max");
        } catch (FileNotFoundException e) {
            throw new MyClassException("Нет такого файла", e);
        }

    }

// Создать метод случайным образом выбрасывающий одно из 3-х исключений. Исключения выбрать самому.
// Вызвать этот метод в блоке try-catch, отлавливающем каждое из 3-х по отдельности.

    public static void methodThrowExceptions(){
        int i = -1;
        if (i < 18)
            throw new RuntimeException("Запрет на допуск");
        if (i > 18)
            throw new RuntimeException("Допуск на сайт");

        if (i < 0)
            throw new RuntimeException("Не корректный возраст");
    }


    //Написать метод, который в 50% случаев бросает исключение.
    // Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.

    public static void twoException() throws FileNotFoundException, ArithmeticException{
        int a = 10 / 0;
        FileInputStream file = new FileInputStream("sdfsdfs");



    }
}
