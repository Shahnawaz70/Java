package com.kodenst.thirdHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	System.out.println("Enter id number to delete");
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
    	Student obj = session.get(Student.class, id);
    	if(obj != null) {
    		System.out.println("Student deleted successfully");
    	} else {
    		System.out.println("Student does not exist");
    	}
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
