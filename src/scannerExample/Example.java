package scannerExample;

import java.util.Scanner;

public class Example {

    public void demo(){
        System.out.println("Enter Number X");
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("Enter Number Y");
        int y = scanner.nextInt();
        System.out.println(i+y);
        System.out.println("Enter Name");
        String next = scanner.next();
        System.out.println("your Name is: "+next);

    }

    public static void main(String[] args) {
        Example example=new Example();
        example.demo();
    }
}
