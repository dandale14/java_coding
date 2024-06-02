package Project1.Client;

import Project1.service.Karvenagar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Karvenagar service = new Karvenagar();
        java.util.Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Course\n2. View Course\n3. Add Faculty\n4. View Faculty\n5. Add Batch\n6. View Batch\n7. Add Student\n8. View Student\n9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.addCourse();
                    break;
                case 2:
                    service.viewCourse();
                    break;
                case 3:
                    service.addFaculty();
                    break;
                case 4:
                    service.viewFaculty();
                    break;
                case 5:
                    service.addBatch();
                    break;
                case 6:
                    service.viewBatch();
                    break;
                case 7:
                    service.addStudent();
                    break;
                case 8:
                    service.viewStudent();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

