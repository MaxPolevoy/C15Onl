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

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone(){

    }
    public Phone(int number, String model, int weight){
        this(number,model);
        this.weight=weight;
    }
    public Phone(int number, String model){
        this.number=number;
        this.model=model;
    }

    public void receiveCall(String name){
      System.out.println("Call: " + name);
    }

    public void receiveCall(String name,int numberCall){
        System.out.println("Call: " + name + " number: " + numberCall);
    }

    public void receiveCall(Person caller){
        System.out.println("Call: " + caller.getFullName());
    }

    public int getNumber(){
        return number;
    }
    public String getModel(){
        return model;
    }
    public int getWeight(){
        return weight;
    }

}
