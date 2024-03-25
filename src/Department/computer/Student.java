package Department.computer;

public class Student {

    String studentName;
    int rollNo;

    public Student (String studentName, int rollNo)
    {
this.rollNo=rollNo;
this.studentName = studentName;

    }

    public void details ()
    {
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Student Name: "+studentName);
    }
}
