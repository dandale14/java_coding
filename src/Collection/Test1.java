package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student1> al = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student1 s = new Student1();

            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            s.setRollno(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter Address: ");
            s.setAddr(sc.nextLine());

            System.out.print("Enter Mobile No: ");
            s.setMobileno(sc.nextLong());

            System.out.print("Enter College Fees: ");
            s.setClgfees(sc.nextDouble());

            System.out.print("Enter Marks: ");
            s.setMarks(sc.nextFloat());
            sc.nextLine();

            System.out.print("Enter College Name: ");
            s.setClgname(sc.nextLine());

            al.add(s);
        }

        // Using Iterator to display the student details
        //System.out.println("\nStudent Details using Iterator:");
       // Iterator<Student1> iterator = al.iterator();
        //while (iterator.hasNext()) {
           // System.out.println(iterator.next());
       // }

        // Using Enhanced for loop to display the student details
        System.out.println("\nStudent Details using Enhanced for loop:");
       for (Student1 student : al) {
            System.out.println(student);
       }

        sc.close();
    }
}