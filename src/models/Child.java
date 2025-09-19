package models;

public class Child {
    private String name;
    private int age;
    private String vaccineName;
    private String nextDoseDate;

    public Child(String name, int age, String vaccineName, String nextDoseDate) {
        this.name = name;
        this.age = age;
        this.vaccineName = vaccineName;
        this.nextDoseDate = nextDoseDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public String getNextDoseDate() {
        return nextDoseDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setNextDoseDate(String nextDoseDate) {
        this.nextDoseDate = nextDoseDate;
    }
}