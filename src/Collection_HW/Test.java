package Collection_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<Employee>();

        for(int i=0;i<5;i++)
        {
            Employee e = new Employee();

            System.out.println("Enter detail of employee"+(i+1));

            System.out.println("Enter ID");
            e.setId(sc.nextInt());
            sc.next();
            System.out.println("Enter name");
            e.setEname(sc.next());
            System.out.println("Enter salary");
            e.setEsalary(sc.nextDouble());
            sc.nextLine();

            System.out.println("Enter Address");
            e.setGender(sc.next());
            sc.nextLine();
            System.out.println("enter mob no");
            e.setMb(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter destination");

            e.setDesignation(sc.nextLine());
            sc.nextLine();
            System.out.println("Enter gender");
            e.setGender(sc.next());

            sc.nextLine();



        }

        for(Employee e : list)
        {
            System.out.println(e);
        }
        sc.close();


    }
}
