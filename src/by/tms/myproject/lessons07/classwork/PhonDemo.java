package by.tms.myproject.lessons07.classwork;

/*Класс Phone.
а) Создайте класс Phone, который содержит переменные number, model и weight.
ж) Добавить конструктор без параметров.
д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных
   класса - number, model и weight.
е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение
“Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
   Вызвать этот метод.
к) Добавьте ещё один перегруженный метод, который будет экземпляр класса Person из первого задания.
   Метод также должен выводит имя звонящего.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.*/

public class PhonDemo {

    public static void main(String[] args) {

        Phone ivan = new Phone(1111,"Samsung",1);
        Phone max = new Phone(5555,"Apple",5);
        Phone mark = new Phone(999,"Motorola",9);

        System.out.println(ivan.getModel());
        System.out.println(ivan.getWeight());
        System.out.println(ivan.getNumber());

ivan.getNumber();
        ivan.receiveCall("Ivan");
        max.receiveCall("Max");
        ivan.receiveCall("Ivan",356);
        max.receiveCall("Max",555);
        System.out.println("Ivan number "+ivan.getNumber());
        System.out.println("Max number "+ max.getNumber());
        ivan.receiveCall("Vika");



    }
}
