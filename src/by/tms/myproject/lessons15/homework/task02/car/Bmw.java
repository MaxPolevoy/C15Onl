package by.tms.myproject.lessons15.homework.task02.car;

import java.util.StringJoiner;

/**
 * Создать класс, являющихся наследниками Car.
 * Переопределить в нем методы equals(), hashCode() и toString()
 */

public class Bmw extends Car {

    public Bmw(String brand, String model, int yearOfManufacture, double engineCapacity) {
        super(brand, model, yearOfManufacture, engineCapacity);
    }

}

