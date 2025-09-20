import models.Child;
import models.User;
import models.Parent;
import models.Doctor;
import services.ReminderService;
import services.ReportService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Child child = null;
        User parentUser = null;
        User doctorUser = null;
        ReportService reportService = new ReportService();
        ReminderService reminderService = new ReminderService();

        boolean running = true;

        while (running) {
            System.out.println("\n--- Vaccine Reminder System ---");
            System.out.println("1. Register Child");
            System.out.println("2. View Parent Report");
            System.out.println("3. View Doctor Report");
            System.out.println("4. Send Reminder");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Child input
                    System.out.print("Enter child's name: ");
                    String childName = scanner.nextLine();

                    System.out.print("Enter child's age: ");
                    int childAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter vaccine name: ");
                    String vaccineName = scanner.nextLine();

                    System.out.print("Enter next dose date (YYYY-MM-DD): ");
                    String nextDoseDate = scanner.nextLine();

                    child = new Child(childName, childAge, vaccineName, nextDoseDate);

                    // Parent input
                    System.out.print("Enter parent name: ");
                    String parentName = scanner.nextLine();

                    System.out.print("Enter parent contact: ");
                    String parentContact = scanner.nextLine();

                    parentUser = new Parent(parentName, parentContact, child);

                    // Doctor input
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();

                    System.out.print("Enter doctor contact: ");
                    String doctorContact = scanner.nextLine();

                    doctorUser = new Doctor(doctorName, doctorContact, child);

                    System.out.println("✅ Registration complete.");
                    break;

                case 2:
                    if (parentUser != null) {
                        reportService.generateUserReport(parentUser);
                    } else {
                        System.out.println("⚠️ No parent registered yet.");
                    }
                    break;

                case 3:
                    if (doctorUser != null) {
                        reportService.generateUserReport(doctorUser);
                    } else {
                        System.out.println("⚠️ No doctor registered yet.");
                    }
                    break;

                case 4:
                    if (child != null) {
                        reminderService.sendReminder(child);
                    } else {
                        System.out.println("⚠️ No child registered yet.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("👋 Exiting Vaccine Reminder System.");
                    break;

                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}