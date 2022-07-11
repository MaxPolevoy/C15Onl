package by.tms.myproject.lessons09.homework09.polygon.quadrangle;

// Прямоугольником называется параллелограмм, у которого все углы прямые.

public class Rectangle extends Parallelogram {
    public Rectangle(double area, double perimeter, double corner, double midLine, double baseLine, double height, double side1, double side2, double side3, double side4, double diagonal) {
        super(area, perimeter, corner, midLine, baseLine, height, side1, side2, side3, side4, diagonal);
    }

    @Override
    public double area() {
        double areaRectangle = 0;
        if (side1 == side2 && side3 == side4) {
            areaRectangle = side1 * side3;
        }
        return areaRectangle;
    }

    //Формула диагонали прямоугольника через
    public double diagonal() {
        if (side1 != side2 && side1 != side3) {
            return Math.sqrt(Math.pow(side1, squareDegree) * Math.pow(side2, squareDegree));
        } else return Math.sqrt(Math.pow(side1, squareDegree) * Math.pow(side4, squareDegree));
    }

    @Override
    public double quadrangleArea() {
        return super.quadrangleArea();
    }


}
