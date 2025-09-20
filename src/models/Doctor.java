//Abstract base class for system users like Parent and Doctor.
package models;

public class Doctor extends User {
    private Child child;

    public Doctor(String name, String contact, Child child) {
        super(name, contact);
        this.child = child;
    }

    @Override
    public void generateReport() {
        System.out.println("--- Doctor Report ---");
        System.out.println("Doctor Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Reviewing Child: " + child.getName());
        System.out.println("Vaccine: " + child.getVaccineName());
        System.out.println("Next Dose Date: " + child.getNextDoseDate());
        System.out.println("Status: Reminder scheduled");
    }
}