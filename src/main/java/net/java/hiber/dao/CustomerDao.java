package net.java.hiber.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.java.hiber.model.customer;
import net.java.hiber.util.Hibernateutil;

public class CustomerDao implements daointerface {
	
	//save students
	//get all students
	//get student by id
	//update student
	//delete student
	
	
	@Override
	public void savecustomer(customer cust) {
		Transaction transaction = null;		
	try(Session session=Hibernateutil.getSessionFactory().openSession()){
	      
		 transaction = session.beginTransaction();
		
           session.save(cust);
		
		   transaction.commit();
		
		}catch(Exception e) {
		
		if(transaction!=null) {
			transaction.rollback();
		}
		
	    }
	}
	//=========================888===========================//
	
	@Override
	public void updatecustomer(customer cust) {
		Transaction transaction = null;		
	try(Session session=Hibernateutil.getSessionFactory().openSession()){
	      
		 transaction = session.beginTransaction();
		
           session.saveOrUpdate(cust);
		
		   transaction.commit();
		
		}catch(Exception e) {
		
		if(transaction!=null) {
			transaction.rollback();
		}
		
	    }
	}
		
	//=====================888============================//
	
	@Override
	public customer getcustomerById(long id) {
	
		Transaction transaction = null;	
		customer cust = null;
	try(Session session=Hibernateutil.getSessionFactory().openSession()){
	      
		 transaction = session.beginTransaction();
		
                cust = session.get(customer.class, id);
                
               // System.out.println(cust);
		
		   transaction.commit();
		
		}catch(Exception e) {
		
		if(transaction!=null) {
			transaction.rollback();
		}
		
	    }
	return cust;
	}	
///=======================888====================//	
	
	@Override
	@SuppressWarnings("deprecation")
	public List<customer> getAllcustomer() {
	
		Transaction transaction = null;
		List<customer> custm = null;
	try(Session session=Hibernateutil.getSessionFactory().openSession()){
	      
		 transaction = session.beginTransaction();
		  custm = session.createQuery("from customer").list();
                	
		   transaction.commit();
		
		}catch(Exception e) {
		
		if(transaction!=null) {
			transaction.rollback();
		}
		
	    }
	return custm;
	}	
	
//========================delete==============================//	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void deletecustomer(long id) {
	
		Transaction transaction = null;	
		customer cust = null;
	try(Session session=Hibernateutil.getSessionFactory().openSession()){
	      
		 transaction = session.beginTransaction();
		
                cust = session.get(customer.class, id);
                session.delete(cust);
                //System.out.println(cust);
		
		   transaction.commit();
		
		}catch(Exception e) {
		
		if(transaction!=null) {
			transaction.rollback();
		}
		
	    }

	}	
	
	
	
	
}
