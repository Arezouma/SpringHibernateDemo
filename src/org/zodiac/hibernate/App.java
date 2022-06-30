package org.zodiac.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.zodiac.hibernate.entity.Account;

public class App {

	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Account.class)
			.buildSessionFactory();
	
	Session session = factory.getCurrentSession();
	
	public boolean insert(int accno,String acctype,double balance)
	{
		session.beginTransaction();
		Account a1 = session.get(Account.class, accno);
		if(a1 == null)
		{
			Account a2 = new Account(accno,acctype,balance);
			session.save(a2);
			session.getTransaction().commit();
			return true;
		}
		return false;
	}

	public double showBalance(int accno)
	{
		session.beginTransaction();
		Account a1 = session.get(Account.class, accno);
		if(a1 == null)
			return 0.0;
		return a1.getBalance();
	}
}