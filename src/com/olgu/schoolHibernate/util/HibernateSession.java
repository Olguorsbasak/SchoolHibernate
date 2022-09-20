package com.olgu.schoolHibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.olgu.schoolHibernate.entity.Course;
import com.olgu.schoolHibernate.entity.CourseMaterial;
import com.olgu.schoolHibernate.entity.Student;
import com.olgu.schoolHibernate.entity.Teacher;

public class HibernateSession {
private static SessionFactory sessionFactory= sessionFactory();
	
	
	private static SessionFactory sessionFactory() {
		
		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(Teacher.class);
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(CourseMaterial.class);

		

		
		SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}	
		

}
