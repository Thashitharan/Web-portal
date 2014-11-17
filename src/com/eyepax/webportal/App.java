package com.eyepax.webportal;

import org.hibernate.Session;

import com.eyepax.webportal.model.Category;
import com.eyepax.webportal.model.Service;
import com.eyepax.webportal.util.HibernateUtil;

public class App {
	
	public static void main(String args[]){
		
		
		System.out.println("Starting session");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Category c = new Category();
		c.setName("General Servsdfsdg");
		c.setType("Non-Registeredsdhsd");
		c.setOtherDetails("otherdetailssdhsdh");
		
		//session.save(c);
		
		
		Service s = new Service();
		
		s.setName("zzzz");
		s.setAccessURL("wwgkkailwaysghksdh");
		s.setAccessCount(55);
		s.setDeleted(false);
		s.setEnabled(true);
		s.setPort(4542);
		s.setDescription("desc");
		s.setLastUpdatedTime("2013-11-14 12:00:44");
		
		s.setCategory(c);
		//c.getServices().add(s);
		
		session.save(s);

		
		session.getTransaction().commit();
		System.out.println("Done");

		
	}

}
