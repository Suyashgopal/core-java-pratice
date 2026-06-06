import java.sql.*;

public class j3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatas";
        String username = "root";
        String password = "weloveu3000";

        // SQL query to insert data

        String query = "INSERT INTO emp (ID, JOB, SALARY) VALUES (345,'bot',30404);";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class name for newer versions
            System.out.println("Driver loaded");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

            // Create a Statement object
            Statement st = con.createStatement();

            // Execute the insert operation
            int rowsAffected = st.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Insert successful: " + rowsAffected + " row(s) affected.");
            } else {
                System.out.println("Insertion failed.");
            }

            // Close the Statement and Connection
            st.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}