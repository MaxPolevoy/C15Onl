package by.tms.myproject.lessons15.homework.task02.car;

import by.tms.myproject.lessons15.collection.Human;

import java.util.*;

public class CarDemo {
    public static void main(String[] args) {
        Car bmw1 = new Bmw("BMW", "X8", 2010, 5.5);
        Car bmw2 = new Bmw("BMW", "X13", 1993, 3);
        Car toyota1 = new Toyota("Toyota", "Corolla", 2013, 5);
        Car toyota2 = new Toyota("Toyota", "Raw 4", 2022, 5.5);

        Garage garage2 = new Garage(new HashMap<>());

        garage2.parking(bmw1, 3);
        garage2.carOut(bmw1, 2);
        garage2.carAmount("BMW");
        garage2.carAmount("BMW");
        System.out.println(garage2);

        Map<List<Car>, Integer> garage = new HashMap<>();
   //    garage.put(bmw1,5);
//        System.out.println(garage.get(bmw1));
  //    garage.put(bmw1, 2);
////        garage.put(toyota2, 1);
//        System.out.println(garage);
//
////        garage.garage.put(bmw1,1);

    }
}

