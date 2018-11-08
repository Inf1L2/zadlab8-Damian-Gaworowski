import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] argv) {

		System.out.println("");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC zanotowano!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/BAZA_PRODUKTÓW", "postgres",
					"postgres");

		} catch (SQLException e) {

			System.out.println("Bład połaczenia");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("Brawo, masz kontrole");
		} else {
			System.out.println("Bład połączenia!");
		}
	}

}