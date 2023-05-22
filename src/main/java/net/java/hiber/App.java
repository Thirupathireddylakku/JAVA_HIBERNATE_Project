package net.java.hiber;
import java.util.List;

import net.java.hiber.dao.CustomerDao;
import net.java.hiber.dao.daointerface;
import net.java.hiber.model.customer;


public class App {

	public static void main(String[] args) {


		customer newdata=new customer("son","father","son@father.com");
		customer newdata1=new customer("mother","son","son@mather.com");
		customer newdata2=new customer("games","alex","alex@gamil.com");
		customer newdata3=new customer("jai","ganesh","ganesh@jai.com");
		daointerface dao=new CustomerDao();
		
		//save student
		dao.savecustomer(newdata);
		dao.savecustomer(newdata1);
		dao.savecustomer(newdata2);
		dao.savecustomer(newdata3);
		//dao.savecustomer(cust);
		
		
		//updatestudent
		newdata.setFname("son");
		 dao.updatecustomer(newdata);
		
		
		//getcustomerbyid
		customer getcustomerById = dao.getcustomerById(2);
		
		
//		//getAllcustomer
       List<customer> allcustomer = dao.getAllcustomer();
        allcustomer.forEach(customer1->System.out.println(customer1));
		
	    //delete customer
        dao.deletecustomer(newdata.getId());
         
         
         
	}
}
