
package Lab04;

public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println();

        Lecturer lec1 = new Lecturer("Kamal Perera", "LEC-001", "Computer Science", 4, 15000.0);
        Lecturer lec2 = new Lecturer("Kasun Perera", "LEC-002", "Mathematics", 3, 16000.0);
        LabAssistant labAsst = new LabAssistant("Amal Perera", "LAB-001", "Physics", 120, 500.0);

        lec2.changeDepartment("Applied Mathematics");

        lec1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
        lec1.showCommonNotice();
        System.out.println();

        lec2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec2.calculateMonthlyPayment());
        lec2.showCommonNotice();
        System.out.println();

        labAsst.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + labAsst.calculateMonthlyPayment());
        labAsst.showCommonNotice();
        System.out.println();

        double totalPayment = lec1.calculateMonthlyPayment() + 
                              lec2.calculateMonthlyPayment() + 
                              labAsst.calculateMonthlyPayment();
                              
        System.out.println("Total Monthly Payment: " + totalPayment);
        System.out.println("Total Staff Created: " + StaffMember.getStaffCount());
    }
}
