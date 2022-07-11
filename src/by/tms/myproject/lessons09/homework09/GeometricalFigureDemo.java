package by.tms.myproject.lessons09.homework09;

import by.tms.myproject.lessons09.homework09.polygon.Polygon;
import by.tms.myproject.lessons09.homework09.polygon.triangle.ObtuseTriangle;
import by.tms.myproject.lessons09.homework09.util.TriangleUtils;
import by.tms.myproject.lessons09.homework09.polygon.quadrangle.Quadrangle;
import by.tms.myproject.lessons09.homework09.polygon.quadrangle.Rectangle;


public class GeometricalFigureDemo {

    public static void main(String[] args) {


        GeometricalFigure rectangle = new Rectangle(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        System.out.println(rectangle.area());
        rectangle.greenResoursable();

        System.out.println();

        Quadrangle rectangle2 = new Rectangle(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        System.out.println(rectangle2.area()); // метод GeometricalFigure
        rectangle2.greenResoursable(); // метод интерфейса

        System.out.println();

        Rectangle rectangle3 = new Rectangle(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        rectangle3.diagonal(); // метод Rectangle

        Polygon triangle = new ObtuseTriangle(5,5,5,5,5,5,5,5);
        //TriangleUtils.isTriangle();


    }
}
