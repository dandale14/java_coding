package CustomException;

import java.util.Scanner;

public class AgeException extends Exception{

    public AgeException(String msg)
    {
        super(msg);
    }

    public  void checkEligibility(int age)throws AgeException
    {
        if (age <18)
        {
            throw  new AgeException("not eligible ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        AgeException ae = new AgeException("not eligible");


        try
        {
           ae.checkEligibility(2);// checkEligibility(age);
            System.out.println("your are eligibale for voting ");
        }
        catch (AgeException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
