package com.kodenst.firstMavenProject;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	EmployeeManagement em = new EmployeeManagement();
    	while(true) {
    		System.out.println("CHOOSE THE OPERATION");
    		System.out.println("1->getEmployeeById");
    		System.out.println("2->getAllEmployees");
    		System.out.println("3->addEmployee");
    		System.out.println("4->updateEmployee");
    		System.out.println("5->deleteEmployee");
    		System.out.println("other->Exit");
    		int ch = sc.nextInt();
    		switch(ch) {
    		case 1: {
    			System.out.println("Enter the ID");
    			int id = sc.nextInt();
    			em.getEmployeeById(id);
    			break;
    		}
    		case 2: {
    			em.getAllEmployees();
    			break;
    		}
    		case 3: {
    			System.out.println("Enter id, name, salary, phone, email, type");
    			int id = sc.nextInt();
    			String name = sc.next();
    			int salary = sc.nextInt();
    			String phone = sc.next();
    			String email = sc.next();
    			String type = sc.next();
    			em.addEmployee(id, name, salary, phone, email, type);
    			break;
    		}
    		case 4: {
    			System.out.println("Enter Employee id");
    			int id = sc.nextInt();
    			em.updateEmployee(id);
    			break;
    		}
    		case 5: {
    			System.out.println("Enter employee id");
    			int id = sc.nextInt();
    			em.deleteEmployee(id);
    		}
    		default: {
    			System.out.println("THANK YOU FOR USING EMS");
    			return;
    		}
    		}
    	}
    }
}
