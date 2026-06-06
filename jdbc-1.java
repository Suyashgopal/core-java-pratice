import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class j1 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/students"; // Change to your database URL
        String user = "suyash"; // Change to your database username
        String password = "weloveu3000"; // Change to your database password

        Connection connection = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            // Check if the connection is valid
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connected to the database successfully!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
    }
}