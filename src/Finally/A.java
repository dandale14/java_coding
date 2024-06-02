package Finally;

public class A {

    public static void main(String[] args) {

        try
        {
            System.out.println("try- block");
            int x=10/0;
            System.out.println("try block end");
        }
        finally {
            System.out.println("finally-block");


        }
        System.out.println("main end");
    }
}
