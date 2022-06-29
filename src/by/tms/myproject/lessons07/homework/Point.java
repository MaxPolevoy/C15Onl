package by.tms.myproject.lessons07.homework;

/*
Создать класс Point, описывающий точку в двумерных координатах.
Полями этого класса должны быть координаты x и y.
Класс должен иметь один конструктор, принимающий координаты x и y.
Создать в классе Point метод distance, принимающий другой объект Point
и определяющий расстояние до неё (можно использовать класс Math).
*/
public class Point {

    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void distance(Point point2) {
        point2 = new Point(10, 10);
        double distance1 = Math.sqrt(Math.pow(point2.getX() - x, 2) + Math.pow(point2.getY() - y, 2));
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
