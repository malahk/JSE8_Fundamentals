package ua.org.oracle.academy.malahk;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 15.06.2015.
 */
public class StudentUtilsTests
{
    @Test
    public void createMapFromBlankList() throws Exception {
        List<Student> temp = new ArrayList<>();
        Map<String, Student> expected = StudentUtils.createMapFromList(temp);

        Assert.assertEquals(expected, StudentUtils.createMapFromList(temp));
    }

    @Test
    public void createMapFromOneStudentList() throws Exception {
        Map<String, Student> expected = StudentUtils.createMapFromList(this.getStudentList());
        Assert.assertEquals(expected, StudentUtils.createMapFromList(this.getStudentList()));
    }

    @Test
    public void testKeyIsCorrect() throws Exception {
        List<Student> temp = new ArrayList<>();
        Student A = this.getStudentA();
        temp.add(A);

        Map<String, Student> expected = StudentUtils.createMapFromList(temp);
        String key = A.getName() + " " + A.getLastName();

        Assert.assertTrue(expected.containsKey(key));
    }

    @Test
    public void testPrintStudents() throws Exception {


    }


    @Test
    public void testSortOfEmpty() throws Exception {
        List<Student> temp = new ArrayList<>();
        List<Student> expected = StudentUtils.sortStudent(temp);
        Assert.assertEquals(expected, temp);
    }

    @Test
    public void testSortOfOneElement() throws Exception {
        List<Student> expected = StudentUtils.sortStudent(this.getStudentList());
        Assert.assertEquals(expected, this.getStudentList());
    }

    @Test
    public void testSortOfTwoElementsRightOrder() throws Exception {
        List<Student> expected = StudentUtils.sortStudent(this.getStudentList2());
        Assert.assertEquals(expected, this.getStudentList2());
    }

    /****** fixtures */

    private Student getStudentA() {
        return new Student("Kirill", "Malah", 5);
    }

    private Student getStudentB() {
        return new Student("Birill", "Malah", 5);
    }

    private List<Student> getStudentList() {
        List<Student> temp = new ArrayList<>();
        temp.add(this.getStudentA());

        return temp;
    }

    private List<Student> getStudentList2() {
        List<Student> temp = new ArrayList<>();
        temp.add(this.getStudentA());
        temp.add(this.getStudentB());

        return temp;
    }

}
