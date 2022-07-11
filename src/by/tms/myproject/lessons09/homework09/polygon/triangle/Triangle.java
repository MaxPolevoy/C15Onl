package by.tms.myproject.lessons09.homework09.polygon.triangle;

// Треугольником называется фигура, которая состоит из трёх точек, не лежащих на одной прямой, и трёх отрезков,
// попарно соединяющих эти точки. Точки называются вершинами треугольника, а отрезки -- его сторонами.


import by.tms.myproject.lessons09.homework09.polygon.Polygon;

public abstract class Triangle extends Polygon {


    protected double fistSideTriangle;
    protected double otherSideTriangle;

    public Triangle(double area, double perimeter, double corner, double midLine, double baseLine, double height, double fistSideTriangle, double otherSideTriangle) {
        super(area, perimeter, corner, midLine, baseLine, height);
        this.fistSideTriangle = fistSideTriangle;
        this.otherSideTriangle = otherSideTriangle;
    }

// Площадь треугольника равна половине произведения основания на высоту,
    // проведенную к этому основанию.
    // S = 1/2 (a × h)

    public int getAcuteAngle(){
        return 3;
    }

    @Override
    public double area() {
        return baseLine * height / 2;
    }

    // высота треугольника через сторону и угол
    public double getHeight() {
        return fistSideTriangle*Math.sin(corner);
    }

    @Override
    public void redResoursable() {
        System.out.println("Рисуем красный треугольник");
    }

    @Override
    public void greenResoursable() {
        System.out.println("Рисуем Зеленый треугольник");
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

    public double getFistSideTriangle() {
        return fistSideTriangle;
    }

    public double getOtherSideTriangle() {
        return otherSideTriangle;
    }
}
