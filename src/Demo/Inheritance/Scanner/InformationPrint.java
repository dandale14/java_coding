package Demo.Inheritance.Scanner;

import java.util.Scanner;

public class InformationPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest + ".");


    }
}

