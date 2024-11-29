package GroupWork.de.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Add: "+ "Id: " + student.getIdStudent() + " First Name: "+ student.getFirstName() + " Last Name: " + student.getLastName());


    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getIdStudent() == id) {
                System.out.println("Student Found: " + student.getFirstName() + " " + student.getLastName());
            }return student;
        }
           return null;
    }

public boolean removeStudent(int id) {

        for (Student student : students) {
            if (student.getIdStudent() == id) {
                students.remove(student);
                System.out.println("Student Removed: " + student.getFirstName() + " " + student.getLastName());
                return true;
            }
        }return false;
}



}
