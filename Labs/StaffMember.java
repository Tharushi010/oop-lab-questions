public abstract class StaffMember {

   private String fullName; 
   private final String staffID; 
   
   protected String department; 
   public StaffMember(String fullName, String staffID, String Department) 
   { 
       this.fullName = fullName; 
       this.staffID = staffID; 
       this.department = department; 
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
   }
}
