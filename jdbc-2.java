import javax.xml.transform.Source;
import java.sql.*;
import java.util.*;

public class j2 {
    public static void main(String[] args) throws ClassNotFoundException{
      String url="jdbc:mysql://localhost:3306/mydatas";
      String username = "root";
      String password ="weloveu3000";

String query ="Select * from emp; ";
        try {
            Class.forName("com.mysql.jdbc.Driver");//loading all drivers
            System.out.println("drivers loaded");
            Connection con = DriverManager.getConnection(url,username,password); ///driver manager class get connection is a method with 3 inputs stores it into instance con ,con is instance of connection interface
            System.out.println("connection estd");
            Statement st = con.createStatement();//no arguments needed
            ResultSet r1 =st.executeQuery(query);
        while(r1.next()){
            int id =r1.getInt("id");
            String job = r1.getString("JOB");
            int sal = r1.getInt("SALARY");
            System.out.println();
            System.out.println("id "   +id);
            System.out.println("salary  "+sal);
            System.out.println("job is "+job);
        }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
