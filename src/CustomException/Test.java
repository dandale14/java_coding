package CustomException;

public class Test {


    public void m1 (int age) throws AgeInvalideException
    {
        System.out.println("M1 Start");
    if(age<18)
        throw  new AgeInvalideException("age issue");
    }


    public static void main(String[] args) {

        Test t = new Test();

        try
        {
            t.m1(5);

        }
        catch (AgeInvalideException e)
        {
            System.out.println(e.getMessage());
        }


    }


}
