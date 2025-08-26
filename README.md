💉 **Vaccine Reminder System**

📌 **Problem Statement**

Many parents find it difficult to keep track of vaccination timelines, which may cause some doses to be missed or delayed. To solve this, we aim to build a system that records child details, maintains their vaccination history, and automatically calculates the due dates for upcoming vaccines (e.g., Polio booster at 2.5 years).

🎯**Objectives**

Register children along with basic details such as name, date of birth, and parent information.

Calculate and display the vaccination schedule according to the child’s age.

Maintain records of completed and pending vaccinations.

Provide simple reports that can be used by doctors or parents for quick reference.

🔑 **Planned Features**

✔️ Child registration and parent information storage

✔️ Predefined vaccine schedule with age-based reminders

✔️ Record of previous vaccinations

✔️ Notifications of upcoming vaccines

✔️ Summary reports of pending and completed doses

**Future Enhancements**

Automated reminders via email/SMS/app.

User-friendly dashboard using JavaFX/Swing.

Role-based access for doctors, parents, and administrators.

🛠️ **Technology Stack**

Programming Language: Java

Database: MySQL

Database Connectivity: JDBC

Version Control: Git & GitHub

📂 **Proposed Project Structure**

Vaccine-Reminder-System/

│── src/

│   ├── models/        # Core classes (Child, Vaccine, Record)

│   ├── database/      # JDBC connection and queries

│   ├── services/      # Business logic (schedule, reminders)

│   └── Main.java      # Program entry point

│

│── resources/

│   └── schema.sql     # Database design and setup

│

│── README.md

🚀 **Future Scope**

Integration with hospital or clinic management systems.

Issuing digital vaccination certificates.

Mobile application support for parents to track and receive alerts.
