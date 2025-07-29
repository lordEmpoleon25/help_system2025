package help_system_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class cadastro {
	  public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3308/help_desk";
	        String user = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	             PreparedStatement statement = connection.prepareStatement("INSERT INTO users ( idUser, password, email, name, type) VALUES ( ?, ?, ?, ?, ?)")) {

	            statement.setInt(1, variaveis.getUser());
	            statement.setString(2, variaveis.getPassword());
	            statement.setString(3, variaveis.getEmail());
	            statement.setString(4, variaveis.getName());
	            statement.setString(5, variaveis.getType());

	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    
	}
}
