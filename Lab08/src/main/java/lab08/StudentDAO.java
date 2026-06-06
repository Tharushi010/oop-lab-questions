
package lab08;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
        "INSERT INTO students(student_id, student_name, mark) VALUES(?,?,?)";

        try (Connection conn =
                StudentDatabaseConnection.getConnection();
             PreparedStatement ps =
                conn.prepareStatement(sql)) {

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getStudentName());
            ps.setInt(3, student.getMark());

            ps.executeUpdate();

            System.out.println("Student added successfully.");

        } catch (SQLException e) {
            System.out.println("Database error.");
        }
    }
}
