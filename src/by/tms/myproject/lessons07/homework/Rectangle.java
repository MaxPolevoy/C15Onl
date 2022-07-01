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

    private Point leftUpperPosition;
    private Point rightUpperPosition;

    public Rectangle() {
    }

    public Rectangle(Point leftUpperPosition, Point rightUpperPosition) {
        this.leftUpperPosition = leftUpperPosition;
        this.rightUpperPosition = rightUpperPosition;
    }

    // Площадь прямоугольника S=a*b
    public double rectangularArea() {
        return Math.abs((rightUpperPosition.getX() - leftUpperPosition.getX()) * (rightUpperPosition.getY() - leftUpperPosition.getY()));
    } // находим длинну сторон и перемножаем по модулю.

    // Периметр прямоугольника S=a+b+c+d,
    public double rectanglePerimeter() {
        return (Math.abs(rightUpperPosition.getX() - leftUpperPosition.getX()) + Math.abs(rightUpperPosition.getY() - leftUpperPosition.getY())) * 2;
    }

    // Диагональ прямоугольника diagonal=√2*S
    public double diagonalRectangle() {
        return Math.sqrt(2 * rectangularArea());
    }

    // ???? можно записать диагональ через вызов метода distance класса Point?
}
