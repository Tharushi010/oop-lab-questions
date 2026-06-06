
package lab08;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public void displayAllStudents() {

    String sql =
        "SELECT student_id, student_name, mark FROM students";

    try (
        Connection conn =
            StudentDatabaseConnection.getConnection();

        PreparedStatement ps =
            conn.prepareStatement(sql);

        ResultSet rs =
            ps.executeQuery()
    ) {

        while (rs.next()) {

            int id = rs.getInt("student_id");
            String name = rs.getString("student_name");
            int mark = rs.getInt("mark");

            System.out.println(
                id + " " + name + " " + mark
            );
        }

    } catch (SQLException e) {
        System.out.println("Database error.");
    }
    }
    public void findStudentById(int studentId) {

    String sql =
        "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";

    try (
        Connection conn = StudentDatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)
    ) {

        ps.setInt(1, studentId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println(
                rs.getInt("student_id") + " " +
                rs.getString("student_name") + " " +
                rs.getInt("mark")
            );

        } else {
            System.out.println("Student not found.");
        }

    } catch (SQLException e) {
        System.out.println("Database error.");
    }
}
    public void updateStudentMark(int studentId, int newMark) {

    String sql =
        "UPDATE students SET mark = ? WHERE student_id = ?";

    try (
        Connection conn = StudentDatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)
    ) {

        ps.setInt(1, newMark);
        ps.setInt(2, studentId);

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Student mark updated successfully.");
        } else {
            System.out.println("Student not found. Mark not updated.");
        }

    } catch (SQLException e) {
        System.out.println("Database error.");
    }
}
}

