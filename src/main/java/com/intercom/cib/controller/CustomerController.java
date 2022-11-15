package com.intercom.cib.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intercom.cib.model.Customer;
import com.intercom.cib.service.CustomerService;

import lombok.extern.log4j.Log4j;




@RestController
@RequestMapping("/customers")
@Log4j
public class CustomerController {
	 
	@Autowired
	 private CustomerService CS;
	
	@GetMapping("/get")
	public List<Customer> getAllCustomers(){
		System.out.println("test request");
       
		
		return CS.GetAll() ;
	}
	
	@GetMapping("/get-customer")
	public Optional<Customer> getCustomer(@RequestParam Integer id){
		System.out.println("getCustomer : ID "+id);
		
		return CS.GetCustomer(id) ;
	}
	@GetMapping("/delete-customer")
	public String deleteCustomer(@RequestParam Integer id){
		System.out.println("getCustomer : ID "+id);
		
		CS.delete(id) ;
		return "Customer Deleted Successfully";
	}
	@PostMapping("/add-customer")
	public Integer addCustomer(@RequestBody Customer c1){
		 CS.save(c1);
		 return c1.getID();
	}

}
