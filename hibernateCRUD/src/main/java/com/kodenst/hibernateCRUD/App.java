package com.kodenst.hibernateCRUD;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE MANAGMENET SYSTEM");
		while (true) {
			System.out.println("Press 1 - > addEmployee");
			System.out.println("Press 2 - > getEmployee");
			System.out.println("Press 3 - > deleteEmployee");
			System.out.println("Press 4 - > updateEmployee");
			System.out.println("Press Other - > exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				addEmployee();
				break;
			case 2:
				getEmployee();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				updateEmployee();
				break;

			default:
				System.out.println("Thanks for using Employee management system");
				factory.close();
				sc.close();
				return;
			}
		}

	}

	public static void addEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter Employee name, salary, email");
		Employee employee = new Employee(sc.next(), sc.nextInt(), sc.next());
		session.persist(employee);
		transaction.commit();
		session.close();
	}

	public static void getEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		Employee obj = session.get(Employee.class, id);
		if (obj != null) {
			System.out.println(obj);
		} else {
			System.out.println("Employee with ID " + id + " does not exists");
		}
		transaction.commit();
		session.close();
	}

	public static void deleteEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		Employee obj = session.get(Employee.class, id);
		if (obj != null) {

			session.remove(obj);
			System.out.println("Employee with ID " + id + " deleted successfully");

		} else {
			System.out.println("Employee with ID " + id + " does not exists");
		}
		transaction.commit();
		session.close();
	}

	public static void updateEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter employee id to update new name, salary and email");
		int id = sc.nextInt();
		Employee obj = session.get(Employee.class, id);
		if (obj != null) {
			System.out.println("Enter new name, salary, email");
			obj.setName(sc.next());
			obj.setSalary(sc.nextInt());
			obj.setEmail(sc.next());
			session.persist(obj);
			System.out.println("Employee updated successfully");
		} else {
			System.out.println("Employee with Id " + id + " does not found try again");
		}
		transaction.commit();
		session.close();
	}
}
