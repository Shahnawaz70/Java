import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class ProcedureUCUCUBanking {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Connection con = null;
	        CallableStatement cs = null;

	        String dPath = "com.mysql.cj.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/kodnest";
	        String user = "root";
	        String password = "Alam@786";

	        // Stored procedure call (choose the one you actually use)
	        // String sql = "call insertCustomer(?,?,?,?,?,?,?,?)";
	        String sql = "call getCustomer(?)";

	        try {
	            Class.forName(dPath);
	            con = DriverManager.getConnection(url, user, password);

	            cs = con.prepareCall(sql);

	            System.out.println("Enter uid");
	            cs.setInt(1, scan.nextInt());

	            boolean res = cs.execute();

	            if (res) {
	                System.out.println("ResultSet detected");

	                ResultSet rs = cs.getResultSet();
	                ResultSetMetaData rmd = rs.getMetaData();

	                while (rs.next()) {
	                    for (int i = 1; i <= rmd.getColumnCount(); i++) {

	                        if (rmd.getColumnTypeName(i).equals("Integer")) {
	                            System.out.print(rs.getInt(i) + " ");
	                        } else if (rmd.getColumnTypeName(i).equals("String")) {
	                            System.out.print(rs.getString(i) + " ");
	                        }
	                    }
	                    System.out.println();
	                }
	            } 
	            else {
	                int result = cs.getUpdateCount();
	                System.out.println(result + " Rows Affected");
	            }
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        } 
	        finally {
	            try {
	                if (con != null) con.close();
	                if (cs != null) cs.close();
	                if (scan != null) scan.close();
	            } 
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
