package by.tms.myproject.lessons07.homework;

/*
Создать класс Point, описывающий точку в двумерных координатах.
Полями этого класса должны быть координаты x и y.
Класс должен иметь один конструктор, принимающий координаты x и y.
Создать в классе Point метод distance, принимающий другой объект Point
и определяющий расстояние до неё (можно использовать класс Math).
*/
public class Point {

    private double x1;
    private double y1;

    public Point(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public double distance(double x1, double y1, Point2 x2, Point y2) {
        double distance1 = Math.sqrt(Math.pow(x2.getX() - x1, 2) + Math.pow(y2.getY() - y1, 2));
        return distance1;
    }


    public double getX() {
        return x1;
    }

    public double getY() {
        return y1;
    }

    public void setX(double x1) {
        this.x1 = x1;
    }

    public void setY(double y1) {
        this.y1 = y1;
    }
}
