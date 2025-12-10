package com.kodenst.firstMavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeManagement {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest";
	String user = "root";
	String password = "Alam@786";

	public EmployeeManagement() {
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void getEmployeeById(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from employee where id =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + rs.getString(4));
			}
		} catch (Exception e) {

		} finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void getAllEmployees() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from employee";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + rs.getString(4));
			}
		} catch (Exception e) {

		} finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void addEmployee(int id, String name, int salary, String phone, String email, String type) {
		PreparedStatement ps = null;
		try {
			String sql = "insert into employee values(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.setString(4, phone);
			ps.setString(5, email);
			ps.setString(6, type);
			int rows = ps.executeUpdate();
			System.out.println("Number of rows effected " + rows);
		}
		catch(Exception e){
		e.printStackTrace();
		}
		finally {
		try {
				ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

	void updateEmployee(int id) {
		PreparedStatement ps = null;
		try {
			System.out.println("A-> Update Name, B-> Phone Number, C-> Email");
			char ch = sc.next().charAt(0);
			String sql = "";
			switch (ch) {
			case 'A': {
				sql = "Update employee set name = ? where id = ?";
				ps = con.prepareStatement(sql);
				System.out.println("Enter new name");
				String name = sc.next();
				ps.setString(1, name);
				ps.setInt(2, id);
				int rows = ps.executeUpdate();
				System.out.println(rows + " employee updated");
				break;
			}
			case 'B': {
				sql = "Update employee set phone = ? where id = ?";
				ps = con.prepareStatement(sql);
				System.out.println("Enter new phone Number");
				String phone = sc.next();
				ps.setString(1, phone);
				ps.setInt(2, id);
				int rows = ps.executeUpdate();
				System.out.println(rows + " employee updated");
				break;
			}
			case 'C': {
				sql = "Update employee set email = ? where id = ?";
				ps = con.prepareStatement(sql);
				System.out.println("Enter new email");
				String email = sc.next();
				ps.setString(1, email);
				ps.setInt(2, id);
				int rows = ps.executeUpdate();
				System.out.println(rows + " employee updated");
				break;
			}
			default: {
				System.out.println("Invalid choice please try again");
				updateEmployee(id);
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void deleteEmployee(int id) {
		PreparedStatement ps = null;
		try {
			String sql = "delete from employee where id =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println(rows + " deleted successfully");
			} else {
				System.out.println("Employee not found");
			}
		} catch (Exception e) {

		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
