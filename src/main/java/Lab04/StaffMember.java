
package Lab04;

public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;
    
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }

    public String getFullName() { return fullName; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }

    public static void showSystemName() {
        System.out.println("--- Campus Staff Payment System ---");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: Please submit timesheets by the 25th.");
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();
}
