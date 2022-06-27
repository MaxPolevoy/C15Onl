package by.tms.myproject.lessons07.classwork;

/*
Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -" fullName  говорит" (идёт).
в) Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
*/


public class PersonDemo {

    public static void main(String[] args) {

        Person ivan = new Person();
        Person vika = new Person("Vika", 30);

        ivan.move();
        ivan.talk();

        System.out.println();

        vika.talk();
        vika.move();

        System.out.println();

        System.out.println(ivan.getFullName());
        System.out.println(ivan.getAge());

        System.out.println();

        System.out.println(vika.getFullName());
        System.out.println(vika.getAge());

    }
}