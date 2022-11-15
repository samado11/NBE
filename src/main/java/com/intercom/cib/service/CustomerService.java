package com.intercom.cib.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intercom.cib.model.Customer;
import com.intercom.cib.repo.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public List<Customer> GetAll(){
		
		return repo.findAll();
	
	}
public void save(Customer c){
		 
		 repo.save(c);
	
	}
public void delete(Integer id){
	 
	 repo.deleteById(id);

}

public Optional<Customer> GetCustomer(Integer id){
		
		return repo.findById(id);
	
	}
	

}
