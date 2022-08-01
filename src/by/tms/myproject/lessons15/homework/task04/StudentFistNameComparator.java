package by.tms.myproject.lessons15.homework.task04;

import java.util.Comparator;

public class StudentFistNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}