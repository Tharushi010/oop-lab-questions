
package labs;

public class LabAssistant extends StaffMember {

    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffId, String department, int hoursWorked, double hourlyRate) 
    {
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails(); // inherited method
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }

    /*
     The department variable can be used in the child class because it is
     declared as 'protected' in the parent class, allowing access in subclasses.
     */
}
