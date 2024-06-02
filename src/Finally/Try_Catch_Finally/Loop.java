package Finally.Try_Catch_Finally;

public class Loop {

    public static void main(String[] args) {

        try
        {
            System.out.println("try - start");
            int x=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException caught");
        }
        finally {
            System.out.println("finally - end");
        }
        System.out.println("main end ");
    }
}
