package com.laundry.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.laundry.model.Customer;

public class CustomerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerRegistration() {
        super();
       
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.print("Step -----> 1 ");
			

			
		try {
			
		
				System.out.print("Step -----> 2 ");
				
				Configuration config=new Configuration();
				config.configure();
				System.out.print("Step -----> 3 ");
				
				SessionFactory sf=config.buildSessionFactory();
				System.out.print("Step -----> 4 ");
				
				Session session=sf.openSession();
				System.out.print("Step -----> 5 ");
				
				Customer customer =new Customer( "pnagar1@gmail.com", "5678", "dhakad", "8359045456", "gram bheswa", "1", "bheswa", "sarangpur", "mp", "bus stand");
				System.out.print("Step -----> 6 ");
				
				Transaction tr=session.beginTransaction();
				System.out.print("Step -----> 7 ");
				
				session.save(customer);
				System.out.print("Step -----> 8 ");
				
				 tr.commit();
					System.out.print("Step -----> 9 ");
					
				 session.close();

		} catch (Exception e) {
			System.out.print(e);
		}		
	
				
		}

}
