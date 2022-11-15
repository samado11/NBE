package com.intercom.cib.controller;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.intercom.cib.model.Customer;
//import com.intercom.cib.service.CustomerService;




@RestController
@RequestMapping("/customers")
public class Test {
	 
//	 @SuppressWarnings("unused")
//	@Autowired
//	 private CustomerService CS;
	
	@GetMapping("/test")
	public String getAllCustomers(){
		System.out.println("test request");
		// List <Customer> customers = CS.GetAll();
		
		return "helal" ;
	}
	
//	@PostMapping("/add-customer")
//	public void addCustomer(Customer c1){
//		// CS.AddCustomer(c1);
//	}

}
