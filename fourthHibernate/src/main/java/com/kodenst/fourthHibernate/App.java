package com.kodenst.fourthHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Enter id of Student to update name and email");
        int id = sc.nextInt();
        Student obj = session.get(Student.class, id);
        if(obj != null) {
        	System.out.println("Enter new name and new email");
        	String name = sc.next();
        	String email = sc.next();
        	obj.setName(name);
        	obj.setEmail(email);
        	session.merge(obj); //session.persist(obj);
        	System.out.println("Name and Email Successfully Updated");
        }
        else {
        	System.out.println(id + " not found to updaate");
        }
        transaction.commit();
        session.close();
        factory.close();
    }
}
