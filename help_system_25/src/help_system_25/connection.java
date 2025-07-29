package help_system_25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connection {

	 public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3308/help_system",
	                    "root", "root");

	            return connection;
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;
	    }
	   
	    public static void main(String[] args) {
	        System.out.println(getConnection());
	    }
	
}
