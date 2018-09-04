package com.test.normalize;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Address addr=new Address();
        addr.setCity("indore");
        addr.setPincode(452001);
        addr.setState("Mp");
        addr.setName("Suresh");
        
        Student s=new Student();
        s.setName("Suresh");
        s.setMarks(93.8f);
        s.getAddr().add(addr);
        
     SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Student.class)
    		 .addAnnotatedClass(Address.class)
    		 .buildSessionFactory();
     
     Session session=sessionFactory.openSession();
     
   Transaction tx= session.beginTransaction();
   
     session.save(addr);
     session.save(s);
   
   tx.commit();
    }
}
