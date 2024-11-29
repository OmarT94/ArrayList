package GroupWork.de.ArrayList;

import java.util.Objects;

public class Student {
    private int idStudent;
    private String FirstName;
    private String LastName;

    public Student(int idStudent, String firstName, String lastName) {
        this.idStudent = idStudent;
        FirstName = firstName;
        LastName = lastName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && Objects.equals(FirstName, student.FirstName) && Objects.equals(LastName, student.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, FirstName, LastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
