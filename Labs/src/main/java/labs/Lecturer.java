
package labs;

public class Lecturer extends StaffMember{

    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department, int courseCount, double paymentPerCourse) 
    {
        super(fullName, staffId, department); 
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    // Display method
    public void displayLecturerDetails() {
        displayBasicDetails(); 
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment per Course: " + paymentPerCourse);
    }
}

