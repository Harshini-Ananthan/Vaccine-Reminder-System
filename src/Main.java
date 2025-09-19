import models.Child;
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

        System.out.println("\n--- Registered Child Details ---");
        System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());
        System.out.println("Vaccine: " + child.getVaccineName());
        System.out.println("Next Dose Date: " + child.getNextDoseDate());

        scanner.close();
    }
}