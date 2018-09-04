package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s=new Student();
        s.setName("ramesh");
        s.setRollno("cs3");
        s.setMarks(98.3f);
        
        Configuration conf=new Configuration().addAnnotatedClass(Student.class);
        
        conf.configure("hibernate.cfg.xml");
         
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        
        SessionFactory sessionfactory=conf.buildSessionFactory(registry);
       
        Session session=sessionfactory.openSession();
        
       Transaction
        transaction=session.beginTransaction();
        session.save(s);
       transaction.commit();
        
    }
}
