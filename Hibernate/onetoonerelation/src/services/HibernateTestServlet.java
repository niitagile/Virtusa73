package services;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import beans.Address;
import beans.EmployeeDetails;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	void register(EmployeeDetails user){
		SessionFactory sessionFactory=new Configuration().configure(new File("E:/workspace5/onetoonerelation/src/hibernate.cfg.xml")).buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDetails e1=new EmployeeDetails();    
	    e1.setName("Kartik");    
	    e1.setEmail("Kartik@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("F-9, ABC nagar");    
	    address1.setCity("Ghaziabad");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);   
	    
		register(e1);
	}

}
