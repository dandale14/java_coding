package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Student> al = new ArrayList<>();

        Student s1 = new Student(1, "abc");
        Student s2 = new Student(2 ,"xyz");
        al.add(s1);
        al.add(s2);

        Iterator<Student> itr = al.iterator();

        while (itr.hasNext())
        {
            Student stu= itr.next();

            System.out.println(stu.rollno);
            System.out.println(stu.name);
        }


    }
}
