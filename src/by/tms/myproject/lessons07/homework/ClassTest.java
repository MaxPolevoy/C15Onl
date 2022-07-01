package by.tms.myproject.lessons07.homework;

/*
Написать тестовый класс с методом main,
демонстрирующим создание объекта класса Rectangle
и применение вышеперечисленных методов.
*/

public class ClassTest {

    public static void main(String[] args) {

        Point point1 = new Point(1, 3);
        Point point2 = new Point(3, 1);

        Rectangle rectangle = new Rectangle(point1,point2);

        System.out.println(point1.distance(point2)); // расстояние до точки
        System.out.println(rectangle.rectangularArea());
        System.out.println(rectangle.rectanglePerimeter());
        System.out.println(rectangle.diagonalRectangle());





    }

}
