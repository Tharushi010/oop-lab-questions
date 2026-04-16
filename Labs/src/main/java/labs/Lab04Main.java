
package labs;

public class Lab04Main {
       public static void main(String[] args) {
           
        StaffMember.showSystemName();
         UniversityPolicy.showPolicyHeader();

        Lecturer lec1 = new Lecturer("Nimal Perera", "L01", "Physics", 5, 15000);
        Lecturer lec2 = new Lecturer("Kamal Dissanayake", "L02", "Electronics", 4, 12000);
        LabAssistant lab1 = new LabAssistant("Anura Dias", "LA01", "Physics", 100, 1000);
        
        lab1.changeDepartment("Computer Science");

        System.out.println();

        StaffMember[] staffList = {lec1, lec2, lab1};

        double totalPayment = 0;

        for (StaffMember staff : staffList) {

            staff.displayBasicDetails();

            double payment = staff.calculateMonthlyPayment();
            System.out.println("Monthly Payment: " + payment);

            staff.showCommonNotice();

            System.out.println();

            totalPayment += payment;
        }
        
        System.out.println("Total Monthly Payment: " + totalPayment);
        System.out.println("Total Staff Members: " + StaffMember.getStaffCount());
    }
}
