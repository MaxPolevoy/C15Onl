package by.tms.myproject.lessons09.homework09.polygon;

// многоугольник

import by.tms.myproject.lessons09.homework09.GeometricalFigure;

public abstract class Polygon extends GeometricalFigure {

    protected double corner; // угол
    protected double midLine; // средняя линия
    protected double baseLine; //основа фигуры
    protected double height; // высота


    public Polygon(double area, double perimeter, double corner, double midLine, double baseLine, double height) {
        super(area, perimeter);
        this.corner = corner;
        this.midLine = midLine;
        this.baseLine = baseLine;
        this.height = height;
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

    public double getCorner() {
        return corner;
    }

    public double getMidLine() {
        return midLine;
    }

    public double getBaseLine() {
        return baseLine;
    }

    public double getHeight() {
        return height;
    }
}