import models.Child;
import models.Doctor;
import models.Parent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Child Registration ---");

        System.out.print("Enter child's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter child's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter vaccine name: ");
        String vaccineName = scanner.nextLine();

        System.out.print("Enter next dose date (YYYY-MM-DD): ");
        String nextDoseDate = scanner.nextLine();

        Child child = new Child(name, age, vaccineName, nextDoseDate);

        System.out.println("\n--- Parent Details ---");
        System.out.print("Enter parent name: ");
        String parentName = scanner.nextLine();

        System.out.print("Enter parent contact: ");
        String parentContact = scanner.nextLine();

        Parent parent = new Parent(parentName, parentContact, child);

        System.out.println();
        parent.generateReport();

        System.out.println("\n--- Doctor Details ---");
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter doctor contact: ");
        String doctorContact = scanner.nextLine();

        Doctor doctor = new Doctor(doctorName, doctorContact, child);

        System.out.println();
        doctor.generateReport();

        scanner.close();
    }
}