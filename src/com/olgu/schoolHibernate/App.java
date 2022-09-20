package com.olgu.schoolHibernate;

import java.time.LocalDate;
import java.time.Month;

import com.olgu.schoolHibernate.dao.StudentDao;
import com.olgu.schoolHibernate.entity.Address;
import com.olgu.schoolHibernate.entity.Gender;
import com.olgu.schoolHibernate.entity.Student;

public class App {

	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		Student melihDumanli = new Student();
		melihDumanli.setFirstName("Melih");
		melihDumanli.setLastName("Dumanlı");
		melihDumanli.setBirthDate(LocalDate.of(1985, Month.AUGUST, 20));
		melihDumanli.setGender(Gender.MALE);
		melihDumanli.setAddress(new Address("Atasehir","14/B","Istanbul"));
		
		sDao.delete(52);
	

	}

}
