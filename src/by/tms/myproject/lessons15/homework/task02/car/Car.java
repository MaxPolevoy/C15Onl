package by.tms.myproject.lessons15.homework.task02.car;

import java.util.Objects;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * <p>
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * <p>
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля (классы которые создали),
 * значением - количество точно таких автомобилей в гараже (количество инты).
 * <p>
 * Добавить в класс Garage методы для парковки, выезда авто,
 * а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */


public abstract class Car {

    private String brand;
    private String model;
    private int yearOfManufacture;
    private double engineCapacity;

    public Car(String brand, String model, int yearOfManufacture, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYearOfManufacture() == car.getYearOfManufacture() && Double.compare(car.getEngineCapacity(), getEngineCapacity()) == 0 && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYearOfManufacture(), getEngineCapacity());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
