package ua.org.oracle.academy.malahk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 15.06.2015.
 */
public class StudentUtils {

    public static final String SPACE = " ";

    public static Map<String, Student> createMapFromList(List<Student> students) {

        Map<String, Student> map = new HashMap<>();

        for(Student student : students) {
            String key = student.getName() + SPACE + student.getLastName();
            map.put(key, student);
        }

        return map;
    }

    public static void printStudents(List<Student> students, int course){

        for(Iterator iterator = students.iterator(); iterator.hasNext();) {
            Student student = (Student) iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.toString());
            }
        }



    }

    public static List<Student> sortStudent(List students) {

        List<Student> result = students;
        result.sort(new StudentComparator());
        return result;


    }
}
