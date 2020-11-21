package com.ssi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Servlet implementation class ABC
 */
public class ABC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.print("jbjhk");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Step -----> 1 ");
		

		try {
			
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();	
		Session session=sessionFactory.openSession();
		System.out.print("Step -----> 5 ");
		
		Simple sp=new Simple(12, "sas");	
		Transaction tr=session.beginTransaction();
		System.out.print("Step -----> 7 ");
		
		session.save(sp);
		 tr.commit();
		 session.close();

		} catch (Exception e) {
			System.out.print(e);
		}
	
	}

}
