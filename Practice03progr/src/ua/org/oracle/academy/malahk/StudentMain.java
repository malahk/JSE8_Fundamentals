package ua.org.oracle.academy.malahk;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Map;

/**
 * Created by Admin on 15.06.2015.
 */
public class StudentMain {

    public static void main (String[] args) {

        Student a = new Student ("Kirill", "Malah", 5);
        Student b = new Student ("Jim", "Reinor", 3);
        Student c = new Student ("Wilson", "Fisck", 3);
        Student d = new Student ("Sara", "Kerrigan", 4);
        Student e = new Student ("Zera", "Tul", 1);
        Student f = new Student ("Ksel", "Naga", 5);


        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(a);
        listOfStudents.add(b);
        listOfStudents.add(c);
        listOfStudents.add(d);
        listOfStudents.add(e);
        listOfStudents.add(f);


        Map<String, Student> mapOfStudents = StudentUtils.createMapFromList(listOfStudents);
        System.out.println(mapOfStudents.toString());


        listOfStudents = StudentUtils.sortStudent(listOfStudents);
        System.out.println(listOfStudents.toString());


        String s = "I AM GROOT I AM GROOT I AM GOD";
        System.out.println(StringUtils.wordCount(s));

    }
}
