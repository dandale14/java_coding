package Javaproject;

import Javaproject.service.Aurangabad;

public class TestProject {
    public static void main(String[] args) {

        Aurangabad a = new Aurangabad();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("1. Add Course\n2. View Course\n3. Add Faculty\n4. View Faculty\n5. Add Batch\n6. View Batch\n7. Add Student\n8. View Student\n9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    a.addCourse();
                    break;
                case 2:
                    a.viewCourse();
                    break;
                case 3:
                    a.addFaculty();
                    break;
                case 4:
                    a.viewFaculty();
                    break;
                case 5:
                    a.addBatch();
                    break;
                case 6:
                    a.viewBatch();
                    break;
                case 7:
                    a.addStudent();
                    break;
                case 8:
                    a.viewStudent();
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
