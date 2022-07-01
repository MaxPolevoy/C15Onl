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

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //     как лучше записывать? point2.x или point2.getX() ?

    public double distance(Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - x, 2) + Math.pow(point2.getY() - y, 2));
    }
//        public double distance(Point point2) {
//        return Math.sqrt(Math.pow(point2.x - x, 2) + Math.pow(point2.y - y, 2));
//    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
