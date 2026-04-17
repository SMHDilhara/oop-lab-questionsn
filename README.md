 Campus Staff Payment System (OOP Java Project)

 Overview

This project is a Java Object-Oriented Programming (OOP) assignment that demonstrates core OOP concepts through a **Campus Staff Payment System**. It models university staff members such as lecturers and lab assistants, calculates their monthly payments, and shows common university policies.






Class Descriptions

StaffMember

Base abstract class containing:

* Full name
* Staff ID
* Department
* Static staff counter
* Shared methods for displaying details
* Abstract method: `calculateMonthlyPayment()`

Lecturer

Represents lecturers paid by course count.

Formula:


Monthly Payment = courseCount × paymentPerCourse


LabAssistant

Represents lab assistants paid hourly.

Formula:


Monthly Payment = hoursWorked × hourlyRate


UniversityPolicy

Contains university-wide constants and utility methods:

* University name
* Bonus rate
* Bonus calculation

Sample Objects Created


Lecturer lec1 = new Lecturer("Kamal Perera", "LEC-001", "Computer Science", 4, 15000.0);
Lecturer lec2 = new Lecturer("Kasun Perera", "LEC-002", "Mathematics", 3, 16000.0);
LabAssistant labAsst = new LabAssistant("Amal Perera", "LAB-001", "Physics", 120, 500.0);


Expected Output Summary

* Displays system name and payment policy header
* Shows each staff member's details
* Calculates monthly payments
* Displays common notice
* Calculates total monthly payment
* Shows total staff count

How to Run

 Using IDE (NetBeans / IntelliJ / Eclipse)

1. Open the project.
2. Navigate to `Lab04Main.java`
3. Run the file.

Using Command Line


javac src/main/java/Lab04/*.java
java Lab04.Lab04Main


## Possible Improvements

* Add Manager / Admin staff classes
* Read staff data from files or database
* Add GUI using JavaFX or Swing
* Include tax and bonus calculations
* Use collections to manage many employees

 Author

Java OOP Academic Project
