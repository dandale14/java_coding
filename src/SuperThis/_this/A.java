package SuperThis._this;

public class A extends B{

    public A ()

    {
        //this(5);
        System.out.println(" constructor - A");
    }

    public A (int a)
    {
        this("abc");
        System.out.println("constructor A - int ");
    }
    public A (String s)
    {
        System.out.println("constructor A - string ");
    }
}
