package com.project.hibernate.Project_hibernate;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
//import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starts........" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        

        
        //user
        User u = new User();
        u.setUid(1);
        u.setFname("Ayub");
        u.setLoc("Proddatur");
        System.out.println(u);
        
        //user1
        User u1 = new User();
        u1.setUid(2);
        u1.setFname("Zubair");
        u1.setLoc("Kadapa");
        System.out.println(u1);
        
        //book
        Book b=new Book();
        b.setId(101);
        b.setName("Focus");
        b.setPages(455);

        
        //book1
        Book b1=new Book();
        b1.setId(102);
        b1.setName("Future");
        b1.setPages(395);

        ArrayList<User> li = new ArrayList<User>();
        li.add(u);
        li.add(u1);
        
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(b);
        list.add(b1);	
        
        u.setBooks(list);
        b1.setUsers(li);
           
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(u);
        session.save(u1);
        session.save(b);
        session.save(b1);
//        
//        User a=(User)session.get(User.class, 1);
//        System.out.println(a.getFname());
//        
//        for(Book b:a.getBooks()) {
//        	System.out.println(b.getName());
//        }
        
        
        tx.commit();
        session.close();
        
    }
}
