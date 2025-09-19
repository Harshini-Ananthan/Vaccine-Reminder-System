package models;

public class Parent extends User {
    private Child child;

    public Parent(String name, String contact, Child child) {
        super(name, contact);
        this.child = child;
    }

    public Child getChild() {
        return child;
    }

    @Override
    public void generateReport() {
        System.out.println("--- Parent Report ---");
        System.out.println("Parent Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Child Name: " + child.getName());
        System.out.println("Vaccine: " + child.getVaccineName());
        System.out.println("Next Dose Date: " + child.getNextDoseDate());
    }
}