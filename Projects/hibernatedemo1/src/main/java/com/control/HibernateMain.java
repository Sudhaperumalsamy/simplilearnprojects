package com.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure();
		conf.addAnnotatedClass(com.to.Player.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		SessionFactory fact=conf.buildSessionFactory(builder.build());
		
		Session session=fact.openSession();
		Transaction transaction=session.beginTransaction();
		Player p1=new Player(101,"USA","Sudha",24);
		session.save(p1);
		transaction.commit();
		session.close();

	}

}
