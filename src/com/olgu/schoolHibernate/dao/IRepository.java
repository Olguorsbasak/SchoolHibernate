package com.olgu.schoolHibernate.dao;

import org.hibernate.Session;

import com.olgu.schoolHibernate.util.HibernateSession;

public interface IRepository <T> {
	public void create(T entity);
	
	public void update(long id, T entity);
	
	public void delete (long id);
	
	public T find(long id);
	
	default Session databaseConnection() {
		
		return HibernateSession.getSessionFactory().openSession();
	}

}
