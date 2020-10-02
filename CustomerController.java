package com.example.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Customer;
import com.example.bank.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/home")
	public String home(){
		return "In Customer Home";
	}
	
	/*
	 * @GetMapping("/getAllAddress") public ResponseEntity<List<Customer>>
	 * getAllCustomer() { List<Customer>
	 * customerList=customerService.getAllCustomers(); return new
	 * ResponseEntity<List<Customer>>(customerList,HttpStatus.OK); }
	 * 
	 * @RequestMapping(value="/addCustomer",method=RequestMethod.PUT) public
	 * ResponseEntity<String> add(@RequestBody Customer customer) { Customer
	 * cust=this.customerService.addCustomer(customer); return new
	 * ResponseEntity<String>("Customer Added Successfully",HttpStatus.CREATED); }
	 */
}
