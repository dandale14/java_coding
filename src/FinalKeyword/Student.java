package FinalKeyword;

public class Student {

    int rollNo;
    String Name;
    String MobNo;
    int fees;
   final String clg="MIT";

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo=10;
        System.out.println(s.rollNo);
        Student s1 = new Student();
        s1.Name="abc";
        Student s3 = new Student();
        s3.fees=1200;
        System.out.println(s3.fees);
        Student s4 = new Student();
        s4.MobNo="9545291992";
        System.out.println("mob no :"+s4.MobNo);
        Student s5 = new Student();
      //  s5.clg="MIT";

    }

}
