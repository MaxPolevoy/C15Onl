package by.tms.myproject.lessons09.homework09.polygon.quadrangle;

// трапеция - четырехугольник

public abstract class Trapezoid extends Quadrangle {


    public Trapezoid(double area, double perimeter, double corner, double midLine, double baseLine, double height, double side1, double side2, double side3, double side4, double diagonal) {
        super(area, perimeter, corner, midLine, baseLine, height, side1, side2, side3, side4, diagonal);
    }

    @Override
    public double area() {
        return midLine*height;
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
