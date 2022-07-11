package by.tms.myproject.lessons09.homework09.сlosedFlatCurve;

// Круг — плоская геометрическая фигура, ограниченная окружностью.

public class Circle extends Ellipse {

    public Circle(double area, double perimeter, int diameter, int radius, double bigSemiaxis) {
        super(area, perimeter, diameter, radius, bigSemiaxis);
    }

    //S = π × r2, где r — это радиус, π — это константа,
    // которая выражает отношение длины окружности к диаметру,
    // она приблизительно равна 3,14.
    @Override
    public double area() {
        return PI+radius*2;
    }
}
