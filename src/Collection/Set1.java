package Collection;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    int rollno;
    String name;

    public static void main(String[] args) {
        Set<Double> s = new HashSet<>();
        s.add(null);
        s.add(null);
        s.add(22.55);
        s.add(33.88);
        s.add(66.2);
        s.add(66.2);
        System.out.println(s);

    }

}
