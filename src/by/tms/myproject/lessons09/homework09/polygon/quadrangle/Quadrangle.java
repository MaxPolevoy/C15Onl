package by.tms.myproject.lessons09.homework09.polygon.quadrangle;

//Четырехугольником называется фигура, которая состоит из четырех точек
// и четырех последовательно соединяющих их отрезков.

import by.tms.myproject.lessons07.homework.Point;
import by.tms.myproject.lessons09.homework09.polygon.Polygon;

public abstract class Quadrangle extends Polygon {

    private Point leftTopPosition;
    private Point rightUpperPosition;

    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    protected double diagonal;

    public Quadrangle(double area, double perimeter, double corner, double midLine, double baseLine, double height, double side1, double side2, double side3, double side4, double diagonal) {
        super(area, perimeter, corner, midLine, baseLine, height);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.diagonal = diagonal;
    }

    // Площадь прямоугольника S=a*b
    public double quadrangleArea() {
        return Math.abs((rightUpperPosition.getX() - leftTopPosition.getX()) * (rightUpperPosition.getY() - leftTopPosition.getY()));
    } // находим длинну сторон и перемножаем по модулю.


    @Override
    public double area() {
        return height*baseLine;
    }

    @Override
    public void redResoursable() {
        System.out.println("Рисуем красный четырехугольник");
    }

    @Override
    public void greenResoursable() {
        System.out.println("Рисуем Зеленый четырехугольник");

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
