package by.tms.myproject.lessons15.homework.task04;

import java.util.Comparator;

public class StudentGradePointComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGradePoint(), o2.getGradePoint());
    }
}
