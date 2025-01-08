package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {
	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setName("sakshi");
		s.setLastname("shinde");
		s.setMarks(98);
		s.setCity("pune");
		ss.persist(s);
		tr.commit();
		ss.close();
	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		int id = 2;
		Student s1 = ss.get(Student.class, id);
		s1.setName("jaysh");
		s1.setLastname("shinde");
		ss.persist(s1);
		tr.commit();

	}

	public void deletdata() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id = 1 ;
		Student s = ss.get(Student.class, id);
		ss.delete(s);
		tr.commit();
	
	}
	public void fatch() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id = 1 ;
		Student s = ss.get(Student.class, id);
		tr.commit();
	
	}
	
}
