package Demo.Inheritance.Scanner;

import java.util.Scanner;

public class AreaAndParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
