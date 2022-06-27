package by.tms.myproject.lessons07.classwork;

/*
Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
секундами, минутами и часами. Создать метод для получения полного количества секунд в объекте.
Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
Создать метод для вывода данных. Написать программу для тестирования возможностей класса.
*/

public class Time {

    private int second;
    private int minute;
    private int hour;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time(int totalSecond) {
        hour = totalSecond / 3600;
        minute = (totalSecond % 3600) / 60;
        second = totalSecond % 3600 % 60;
    }

    public int getTotalSecond() {
        return hour * 3600 + minute * 60 + second;
    }

}
