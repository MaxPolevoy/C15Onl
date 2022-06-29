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

    // Площадь прямоугольника S=a*b*c*d
    public double rectangularArea() {
        return (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) *
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) *
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) *
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2)));
    }

    // Периметр прямоугольника S=a+b+c+d
    public double rectanglePerimeter() {
        return (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) +
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) +
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2))) +
                (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2)));
    }

    // Диагональ прямоугольника diagonal=√2*S
    public double diagonalLength1() {

        return Math.sqrt(2 * rectangularArea());
    }

    // Диагональ прямоугольника diagon=√(x1-x2)²+(y1-y2)²
    public double diagonalLength2() {

        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2));
    }
}
