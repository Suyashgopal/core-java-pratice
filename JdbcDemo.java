// JDBC - connecting java to a database (MySQL)
// NOTE: this needs mysql running and the connector jar in classpath
// it is just to show how JDBC works, may not run without db setup

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {

        // database details - change as per your setup
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try {
            // step 1 - get connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database");

            // step 2 - create a table (using Statement)
            Statement st = con.createStatement();
            st.execute("CREATE TABLE IF NOT EXISTS students " +
                    "(id INT PRIMARY KEY, name VARCHAR(50), marks INT)");

            // step 3 - insert data using PreparedStatement (safer)
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students VALUES (?, ?, ?)");
            ps.setInt(1, 1);
            ps.setString(2, "Anjali");
            ps.setInt(3, 88);
            ps.executeUpdate();
            System.out.println("Row inserted");

            // step 4 - select and read data
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            System.out.println("Students:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                        rs.getString("name") + " " + rs.getInt("marks"));
            }

            // transaction example - commit manually
            con.setAutoCommit(false);
            st.executeUpdate("UPDATE students SET marks = 90 WHERE id = 1");
            con.commit();   // save the change
            System.out.println("Transaction committed");

            // step 5 - close connection
            con.close();

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
