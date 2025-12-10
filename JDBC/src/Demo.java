import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String dpath = "com.mysql.cj.jdbc.Driver"; // Best Practice this
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String user = "root";
		String password = "Alam@786";
		Connection con = null;
		Statement stmt = null;
		String sql = "select * from students";
		ResultSet rs = null;
		try {
			// step- 1 loading Driver 
			//Class.forName("com.mysql.cj.jdbc.Driver"); // We can load path using this as well
			
			Class.forName(dpath);
			System.out.println("Driver loaded");
			
			// Step- 2 Establish the connection
			//DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest", "root", "Alam@786");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Establish");
			
			// Step- 3 Create the medium
			// con.createStatement();
			// Statement stmt = con.createStatement();
			stmt = con.createStatement();
			System.out.println("Statement created");
			
			// Step- 4 Query
			// ResultSet rs = stmt.executeQuery("select * from students");
			rs = stmt.executeQuery(sql);
			System.out.println("Query executed and got the data / result");
			
			// Step- 5 Display the result(data)
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
