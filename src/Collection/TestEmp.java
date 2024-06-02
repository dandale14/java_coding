package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestEmp {

    public static void main(String[] args) {
Employee1 e = new Employee1();
        Set<Employee1> hs = new HashSet<>();

        System.out.println("employee details");
e.setId(1);
e.setName("dnyaneshwar");
e.setDesignation("Software engineer");
e.setCname("cts");
e.setJdate(2223);

 for(Employee1 emp : hs)
 {
     System.out.println(emp);
 }


    }
}
