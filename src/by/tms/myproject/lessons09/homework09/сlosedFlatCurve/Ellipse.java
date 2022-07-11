package by.tms.myproject.lessons09.homework09.сlosedFlatCurve;

public class Ellipse extends ClosedFlatCurve {

protected double bigSemiaxis;

    public Ellipse(double area, double perimeter, int diameter, int radius, double bigSemiaxis) {
        super(area, perimeter, diameter, radius);
        this.bigSemiaxis = bigSemiaxis;
    }

//S=π⋅R⋅r, где R — большая полуось, r — малая полуось, π — число Пи (3,14159…)

    @Override
    public double area() {
        return PI*bigSemiaxis*radius;
    }

    @Override
    public void redResoursable() {
        System.out.println("Рисуем красный эллипс");
    }

    @Override
    public void greenResoursable() {
        System.out.println("Рисуем зеленый эллипс");
    }
}
