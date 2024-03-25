package Department.mechanical;

public class Teacher {

    String subject;
    String teacherName;

    public Teacher(String subject, String teacherName) {
        this.subject = subject;
        this.teacherName = teacherName;
    }
    public void teacherDetails(){
        System.out.println("Subject: "+subject);
        System.out.println("Teacher Name: "+teacherName);
    }
}
