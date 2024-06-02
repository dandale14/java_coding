package Encapsulation.Protected;

import Encapsulation.*;

public class C extends A{

    A a = new A();

    public void m2()
    {
        C c = new C();
        System.out.println(c.x);
        System.out.println(x);

    }
}
