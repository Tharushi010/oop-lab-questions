package lab07;

public class StudentMarkReportTest {
    public static void main(String[] args) {

        String[] marks = {"78", "82", "absent", "90"};

        StudentMarkReport report = new StudentMarkReport(marks);

        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark: " + mark);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }

        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);
        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }
         System.out.println("Report checking completed.");
        }
}
