package com.kodenst.firstMavenProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String un = "root";
		String pwd = "Alam@786";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM result WHERE rollNo = ?";
		try {
			System.out.println("Enter roll Number");
			int rollNo = sc.nextInt();
			Class.forName(path);
			con = DriverManager.getConnection(url, un, pwd);
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, rollNo);
			rs = stmt.executeQuery();
			System.out.println("BATCHES TABLE");
			System.out.println("ROLLNO" +  "| " + "NAME" + "| " +  "M1" + "| " +  "M2" + "| " +  "M3" + "| " +  "M4" + "| " + "PER");
			while(rs.next()) {
				int r = rs.getInt(1);
				String n = rs.getString(2);
				int m1 = rs.getInt(3);
				int m2 = rs.getInt(4);
				int m3 = rs.getInt(5);
				int m4 = rs.getInt(6);
				int total = m1+m2+m3+m4;
				float p = (float) total/400;
				float per = p*100;
				
				System.out.println(r + " " + n + " " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + per);
			}
			con.close();
			stmt.close();
			rs.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
