package by.tms.myproject.lessons09.homework09;


// Геометрическая фигура
public abstract class GeometricalFigure implements Resoursable {
    protected final double PI = 3.14;
    protected final double squareDegree = 2;
    protected double area;
    protected double perimeter;

    public GeometricalFigure(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public abstract double area();

    public double getPI() {
        return PI;
    }

    public double getSquareDegree() {
        return squareDegree;
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

