package by.tms.myproject.lessons15.homework.task04;
/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {

        Comparator<Student> student = new StudentFistNameComparator().thenComparing(new StudentLastNameComparator().thenComparing(new StudentAgeComparator().thenComparing(new StudentGradePointComparator())));
        Student student1 = new Student("Иван", "Петров", 12, 6);
        Student student2 = new Student("Иван", "Иванов", 10, 7.5);
        Student student3 = new Student("Вера", "Сидорова", 14, 5.5);
        Student student4 = new Student("Света", "Сидорова", 14, 10);

        /** делаем коллекцию через статический метод List.of - не поддерживает изменения*/
        //  List<Student> students = List.of(student1, student2, student3, student4);
        /** делаем коллекцию добавляем через asList */
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        System.out.println(students);

        /** Сортируем по фамилия*/
        students.sort(new StudentLastNameComparator());
        System.out.println(students);

        /** Отсортировать и вывести список учеников по имя, фамилия, возраст и средний балл*/
        students.sort(student);
        System.out.println(students);

        /**Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу*/


    }
}
