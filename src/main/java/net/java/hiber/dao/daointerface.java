package net.java.hiber.dao;

import java.util.List;

import net.java.hiber.model.customer;

public interface daointerface {

	void savecustomer(customer cust);


	void updatecustomer(customer cust);

	customer getcustomerById(long id);


	List<customer> getAllcustomer();

	void deletecustomer(long id);

}