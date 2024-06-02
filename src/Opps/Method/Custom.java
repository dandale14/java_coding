package Opps.Method;

public class Custom {
    public void m1()
    {
        System.out.println("custon method");
    }
    public void m2(int a)

    {
        System.out.println("parameterized method");
    }
    public int m3()
    {
        System.out.println("Retrurn type method");
        return 20;
    }
    public String m4(int a)
    {
        System.out.println("Return with parameterized method");
        return "abc";
    }

    public static void main(String[] args) {
        Custom custom = new Custom();
        custom.m1();
        custom.m2(20);
        custom.m3();
        custom.m4(10);
        System.out.println("method");

    }
}
