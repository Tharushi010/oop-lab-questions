
package labs;

public abstract class StaffMember {

   private String fullName; 
   private final String staffID; 
   protected String department; 
   
   private static int staffCount = 0;

   public StaffMember(String fullName, String staffID, String department) 
   { 
       this.fullName = fullName; 
       this.staffID = staffID; 
       this.department = department; 
       
       staffCount++; 
   } 
   public String getFullName() 
   { 
       return fullName; 
   } 
   public String getStaffID() 
   { 
       return staffID; 
   } 
   public String getDepartment() 
   {
       return department; 
   }
   public final void displayBasicDetails()
   {
       System.out.println("Full name: " + fullName); 
       System.out.println("Staff ID: " + staffID); 
       System.out.println("Department: " + department); 
   }
    public abstract double calculateMonthlyPayment();  
    
    public static void showSystemName() {
        System.out.println("--- University Staff Management System ---");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    /*staffCount is static because it is shared among all objects and keeps track 
    of the total number of staff members created.*/
    
    public void changeDepartment(String newDepartment) {
    if (newDepartment != null && !newDepartment.trim().isEmpty()) {
        this.department = newDepartment;
    }
}

// notice for all staff
public final void showCommonNotice() {
    System.out.println("Notice: All staff must follow university rules and regulations.");
}

/* changeDepartment(...) is useful because it ensures controlled updates,
preventing invalid or empty values from being assigned.*/
}
