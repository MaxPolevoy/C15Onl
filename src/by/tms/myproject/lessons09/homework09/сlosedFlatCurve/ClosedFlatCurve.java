package by.tms.myproject.lessons09.homework09.сlosedFlatCurve;

import by.tms.myproject.lessons09.homework09.GeometricalFigure;

public abstract class ClosedFlatCurve extends GeometricalFigure {


    protected int diameter;
    protected int radius;

    public ClosedFlatCurve(double area, double perimeter, int diameter, int radius) {
        super(area, perimeter);
        this.diameter = diameter;
        this.radius = radius;
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

    public int getDiameter() {
        return diameter;
    }

    public int getRadius() {
        return radius;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
