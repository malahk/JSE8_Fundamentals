package ua.org.oracle.academy.malahk;

/**
 * Created by Admin on 15.06.2015.
 */
public class Student {

    private String name;
    private String lastName;
    private int course;

    public Student (String name, String lastName, int course){

        this.name = name;
        this.lastName = lastName;
        this.course = course;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getCourse() != student.getCourse()) return false;
        if (!getName().equals(student.getName())) return false;
        return getLastName().equals(student.getLastName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getCourse();
        return result;
    }


    public int getCourse() {

        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}

