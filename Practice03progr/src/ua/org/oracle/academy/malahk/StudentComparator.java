package ua.org.oracle.academy.malahk;

import java.util.Comparator;

/**
 * Created by Admin on 15.06.2015.
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getName().compareToIgnoreCase(o2.getName());

    }

}
