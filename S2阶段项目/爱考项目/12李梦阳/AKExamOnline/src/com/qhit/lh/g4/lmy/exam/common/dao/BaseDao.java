package com.qhit.lh.g4.lmy.exam.common.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.lmy.exam.common.utils.HibernateSessionFactory;
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
