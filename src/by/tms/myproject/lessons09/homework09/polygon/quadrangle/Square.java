package by.tms.myproject.lessons09.homework09.polygon.quadrangle;

//Квадратом называется прямоугольник, у которого все стороны равны.

public class Square extends Rectangle {

    public Square(double area, double perimeter, double corner, double midLine, double baseLine, double height, double side1, double side2, double side3, double side4, double diagonal) {
        super(area, perimeter, corner, midLine, baseLine, height, side1, side2, side3, side4, diagonal);
    }

    public double area() {
        double equalsSquare = 0;
        if (side1 == side2 && side2 == side3) {
            equalsSquare = Math.pow(side1, squareDegree);
        }
        return equalsSquare;
    }
}
