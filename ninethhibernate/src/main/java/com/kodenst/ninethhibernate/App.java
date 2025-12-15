package com.kodenst.ninethhibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Tarana", "tara@gmail.com");
        Student s2 = new Student("Nikhat", "nikhat@gmail.com");
        Student s3 = new Student("Pakeeja", "pakeeja@gmail.com");
        		
        
        Club c1 = new Club("Sports");
        Club c2 = new Club("NCC");
        Club c3 = new Club("Army");
        
//        Set<Student> studentSet = new HashSet<Student>();
//        studentSet.add(s1);
//        studentSet.add(s2);
//        studentSet.add(s3);
        
        Set<Club> clubSet1 = new HashSet<Club>();
        clubSet1.add(c1);
        clubSet1.add(c2);
       
        Set<Club> clubSet2 = new HashSet<Club>();
        clubSet2.add(c2);
        clubSet2.add(c3);
        
        Set<Club> clubSet3 = new HashSet<Club>();
        clubSet3.add(c1);
        clubSet3.add(c3);
        
        s1.setClubs(clubSet1);
        s2.setClubs(clubSet2);
        s3.setClubs(clubSet3);
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        
        transaction.commit();
        session.close();
        factory.close();
    }
}
