package com.kodenst.firstHibernet;

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
    	System.out.println("Enter name, marks and email");
        Student s1 = new Student(sc.next(), sc.nextInt(), sc.next());
        
        // Step 1: Load the configuration file
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        // Step 2: Create the session Factory
        SessionFactory factory =  configuration.buildSessionFactory();
        
        // Step 3: Open a session
        Session session = factory.openSession();
        
        // Step 4: Begin a Transaction
        Transaction transaction = session.beginTransaction();
        
        // Step 5: Perform Operation
        session.persist(s1);
        
        // Step 6: Commit the transaction
        transaction.commit();
        
        // Step 7: close the session & Session Factory
        session.close();
        factory.close();
        sc.close();
        
    }
}
