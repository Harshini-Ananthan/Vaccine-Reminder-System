package services;

import models.User;

public class ReportService {
    public void generateUserReport(User user) {
        user.generateReport();
    }
}