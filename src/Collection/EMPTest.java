package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EMPTest {
    public static void main(String[] args) {
        ArrayList <Employee> al = new ArrayList<>();

        Employee E1 = new Employee();
        E1.setId(1);
        E1.setEname("pbc");
        E1.setEsalary(50000);
        E1.setAddr("pune");
        E1.setMb(9545291992L);
        E1.setDesignation("developer");
        E1.setGender("male");
        al.add(E1);

        Iterator<Employee> iterator= al.iterator();
        while (iterator.hasNext())
        {
           Employee emp = iterator.next();
            System.out.println(emp.getAddr());
            System.out.println(emp.getDesignation());
            System.out.println(emp.getEname("pew"));
            System.out.println(emp.getGender());
            System.out.println(emp.getEsalary());
        }


    }
}
