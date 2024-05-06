package Opps;

public class Main {

    public static void main(String[] args) {

        Child c = new Child();
        Parent p = new Parent();
        p.ParentMethod();
        c.ParentMethod();
        c.ParentMethod();
        c.ChildMethod();
        p.ParentMethod();
    }
}

