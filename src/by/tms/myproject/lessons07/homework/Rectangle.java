package by.tms.myproject.lessons07.homework;

/*
Используя класс точки, создать класс Rectangle, описывающий прямоугольник
(у Rectangle должно быть минимум два конструктора).
В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
Создать следующие методы в классе Rectangle:
- Высчитывающий площадь прямоугольника
- Высчитывающий периметр прямоугольника
- Высчитывающий длину диагонали
*/


public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle() {

    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }


}
