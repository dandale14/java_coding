package Demo.Inheritance.Scanner;

import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        String concatenatedString = firstString + secondString;
        System.out.println("Output: " + concatenatedString);

    }
}
