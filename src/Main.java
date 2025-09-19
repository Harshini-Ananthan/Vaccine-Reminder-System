import models.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Aarav", 2, "MMR", "2025-10-15");

        System.out.println("--- Child Registration ---");
        System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());
        System.out.println("Vaccine: " + child.getVaccineName());
        System.out.println("Next Dose Date: " + child.getNextDoseDate());
    }
}