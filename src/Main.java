import models.Child;
import models.User;
import models.Parent;
import models.Doctor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Child input
        System.out.println("--- Child Registration ---");
        System.out.print("Enter child's name: ");
        String childName = scanner.nextLine();

        System.out.print("Enter child's age: ");
        int childAge = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter vaccine name: ");
        String vaccineName = scanner.nextLine();

        System.out.print("Enter next dose date (YYYY-MM-DD): ");
        String nextDoseDate = scanner.nextLine();

        Child child = new Child(childName, childAge, vaccineName, nextDoseDate);

        // Parent input
        System.out.println("\n--- Parent Details ---");
        System.out.print("Enter parent name: ");
        String parentName = scanner.nextLine();

        System.out.print("Enter parent contact: ");
        String parentContact = scanner.nextLine();

        User parentUser = new Parent(parentName, parentContact, child);

        // Doctor input
        System.out.println("\n--- Doctor Details ---");
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter doctor contact: ");
        String doctorContact = scanner.nextLine();

        User doctorUser = new Doctor(doctorName, doctorContact, child);

        // Reports using polymorphism
        System.out.println();
        parentUser.generateReport();

        System.out.println();
        doctorUser.generateReport();

        scanner.close();
    }
}