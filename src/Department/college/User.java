package Department.college;

import Department.computer.Student;
import Department.computer.Teacher;


public class User {
    public static void main(String[] args) {
        Student student = new Student("Raj", 232);
        student.details();
        Teacher teacher = new Teacher("Math", "Kunal");
        teacher.teacherDetails();
        Department.mechanical.Student student1 = new Department.mechanical.Student("Pavan", 242);
        student1.details();
        Department.mechanical.Teacher teacher1 = new Department.mechanical.Teacher("NSA", "TSNS");
        teacher1.teacherDetails();

    }
}
