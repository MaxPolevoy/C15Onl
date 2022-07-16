package by.tms.myproject.lessons11.homework;

// Создать собственный класс-исключение, сделав его проверяемым исключением.
// Добавить в конструктор своих классов возможность указания сообщения и/или другого исключения.

public class MyClassException extends Exception {

    public MyClassException() {
    }

    public MyClassException(String message) {
        super(message);
    }

    public MyClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyClassException(Throwable cause) {
        super(cause);
    }
}
