package GroupWork.de.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList();
        student.add(new Student(1,"Omar","Tamr"));
        student.add(new Student(2,"Emre","Alak"));
        student.add(new Student(3,"Altan_Der_Berliner","Güven"));
        for (Student s : student) {
            System.out.println(s);
        }

        System.out.println("****************************");

        School school =new School();
        school.addStudent(new Student(4,"Omar2","Tamr2"));
        school.addStudent(new Student(5,"Emre2","Alak2"));
        school.addStudent(new Student(6,"Altan_Der_Berliner2","Güven2"));


        Student foundSt=school.findStudentById(0);
        if(foundSt!=null){
            System.out.println("Founded " + foundSt);
        }else System.out.println("Student not found");
        System.out.println("*********************");


        System.out.println(school.removeStudent(1));

        for (Student s : student) {
            System.out.println(s);
        }






    }
}
