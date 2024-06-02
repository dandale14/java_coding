package Collection_HW;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> al = new ArrayList<>();

        for(int i=0;i<3;i++)
        {
            Address address = new Address();
            Student student = new Student();
            System.out.print("Enter student Details: "+(i+1));


            System.out.println("enter student rollno");
            student.setRollno(sc.nextInt());
            sc.nextLine();
            System.out.println("enter student name");
            student.setSname(sc.nextLine());

            System.out.println("enter student gender");
            student.setGender(sc.nextLine());
            System.out.println("enter mobno");
            student.setMobno(sc.nextLong());
            System.out.println("enter fees");
            student.setFees(sc.nextDouble());
            System.out.println("enter area name");
            address.setAreaname(sc.nextLine());
            sc.nextLine();
            System.out.println("enter city name");
            address.setCity(sc.next());
            sc.nextLine();



        }

        for(Student student : al)
            System.out.println(student);
    }

}
