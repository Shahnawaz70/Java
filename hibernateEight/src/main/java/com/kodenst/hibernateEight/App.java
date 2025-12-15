package com.kodenst.hibernateEight;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Department department = new Department("IT", "5th Floor");
      
      Employee employee1 = new Employee("Numan", "95000", department);
      Employee employee2 = new Employee("Adnan", "85000", department);
      Employee employee3 = new Employee("Arman", "75000", department);
      Employee employee4 = new Employee("Affan", "65000", department);
      
      List<Employee> empList = new ArrayList<Employee>();
      empList.add(employee1);
      empList.add(employee2);
      empList.add(employee3);
      empList.add(employee4);
      
      department.setEmployees(empList);
      
      SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      Session session = factory.openSession();
      Transaction transaction = session.beginTransaction();
      session.persist(department);
      transaction.commit();
      session.close();
      factory.close();
    }
}
