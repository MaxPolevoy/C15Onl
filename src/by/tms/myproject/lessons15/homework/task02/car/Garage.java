package by.tms.myproject.lessons15.homework.task02.car;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля (классы которые создали),
 * значением - количество точно таких автомобилей в гараже (количество инты). value
 * <p>
 * Добавить в класс Garage методы для парковки, выезда авто,
 * а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */


public class Garage {

    private HashMap<Car, Integer> carGarage;

    public Garage(HashMap<Car, Integer> carGarage) {
        this.carGarage = carGarage;
    }

    public void parking(Car car, int a) {
        if (!carGarage.containsKey(car)) {
            carGarage.put(car, a);
        } else {
            carGarage.replace(car, carGarage.get(car) + a);
        }
        System.out.println(a + " " + car.getBrand() + " " + car.getModel() + " паркуется");
    }

    public void carOut(Car car, int a) {
        if (carGarage.containsKey(car)) {
            carGarage.replace(car, carGarage.get(car) - a);
            System.out.println(a + " " + car.getBrand() + " выезжает");
        } else {
            carGarage.replace(car, 0);
        }
    }

    public void carAmount(String car) {
        int amountCarInGarage = 0;
        for (Map.Entry<Car, Integer> item : carGarage.entrySet()) {
            if (item.getKey().getBrand().equals(car)) {
                amountCarInGarage += item.getValue();
            }
        }
        System.out.println("в гараже: " + amountCarInGarage + " " + car);
    }

    public HashMap<Car, Integer> getCarGarage() {
        return carGarage;
    }

    public void setCarGarage(HashMap<Car, Integer> carGarage) {
        this.carGarage = carGarage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carGarage=" + carGarage +
                '}';
    }
}