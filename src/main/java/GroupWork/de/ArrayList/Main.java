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
        school.addStudent(new Student(1,"Omar2","Tamr2"));
        school.addStudent(new Student(2,"Emre2","Alak2"));
        school.addStudent(new Student(3,"Altan_Der_Berliner2","Güven2"));

        System.out.println("************************************");
        //Find Student BY ID
        Student foundSt=school.findStudentById(1);
        if(foundSt!=null){
            System.out.println("Founded " + foundSt);
        }else
        {System.out.println("Student not found");
        System.out.println("*********************");
        }


        //Remove Student By id!
        System.out.println("Before Removing");
        school.printAllStudents();
        school.removeStudent(2);
        System.out.println("After Removing");

        school.printAllStudents();








    }
}
