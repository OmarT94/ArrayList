package GroupWork.de.ArrayList;

import java.util.Objects;

public class Student {
    private int idStudent;
    private String firstName;
    private String lastName;

    public Student(int idStudent, String firstName, String lastName) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                '}';
    }
}
