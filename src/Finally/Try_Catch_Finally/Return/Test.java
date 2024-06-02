package Finally.Try_Catch_Finally.Return;

public class Test {

    public int m1() {
        int x = 10;


        try {
            System.out.println("try start");
            return x;

        } finally {
            x = 60;
            System.out.println("finally start" + x);
            return x;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        int X=t.m1();
        System.out.println(X);
    }

}
