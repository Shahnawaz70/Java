import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UCUCUBanking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		String SQL1 = "Update ucuc set balance = balance - ? where userID = ? and password=?";
		String SQL2 = "Update ucuc set balance = balance + ? where userID=?";
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String user = "root";
		String password = "Alam@786";
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url, user, password);
			ps1 = con.prepareStatement(SQL1);
			ps2 = con.prepareStatement(SQL2);
			
			System.out.println("Enter from UserID and Password");
			int fuid = sc.nextInt();
			String pwd = sc.next();
			
			System.out.println("Enter to UserID");
			int tuid = sc.nextInt();
			System.out.println("Enter amount to be transferred");
			int amt = sc.nextInt();
			
			ps1.setInt(1, amt);
			ps1.setInt(2, fuid);
			ps1.setString(3, pwd);
			
			ps2.setInt(1, amt);
			ps2.setInt(2, tuid);
			
			con.setAutoCommit(false);
			int rs1 = ps1.executeUpdate();
			int rs2 = ps2.executeUpdate();
			con.commit();
			System.out.println((rs1 + rs2) + "rows updated");
		}
		catch (Exception e) {
			try {
				con.rollback();
				e.printStackTrace();
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		finally {
			try {
				if(con != null) con.close();
				if(ps1 != null) ps1.close();
				if(ps2 != null) ps2.close();
				if(sc != null) sc.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
