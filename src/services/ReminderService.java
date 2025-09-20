//Handles vaccine reminder logic.
package services;

import models.Child;

public class ReminderService {
    public void sendReminder(Child child) {
        System.out.println("--- Vaccine Reminder ---");
        System.out.println("Reminder: " + child.getName() + " is scheduled for " +
                           child.getVaccineName() + " on " + child.getNextDoseDate());
        System.out.println("Please ensure timely vaccination.");
    }
}