import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class mysql {
    public static void main(String[] args) {
        
        mysqlConnect();
    }
    private static void mysqlConnect(){
        System.out.println("Test");

	try {
            Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
            System.out.println("gdzie MySQL JDBC Driver?");
            e.printStackTrace();
            return;
	}

	System.out.println("MySQL JDBC Driver zanotowano!");
	Connection connection = null;

	try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BAZA_PRODUKTÓW", "postgres" , "postgres");
	} catch (SQLException e) {
            System.out.println("zawiodło");
            e.printStackTrace();
            return;
	}
        
	if (connection != null) System.out.println("Brawo! Masz połaczenie");
         else System.out.println("Nie połączono !");
    
    }}