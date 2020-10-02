package com.example.bank.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.bank.entity.Address;
import com.example.bank.service.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/home")
	public String home() {
		return "In Address home";
	}
	
	@GetMapping("/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress() {
		List<Address> addressList=addressService.getAllAddress();
		return new ResponseEntity<List<Address>>(addressList,HttpStatus.OK);
	}
	
	@RequestMapping(value="/addAddress",method=RequestMethod.PUT)
	public ResponseEntity<String> addAddress(@RequestBody Address address) {
		Address add=this.addressService.addAddress(address);
		return new ResponseEntity<String>("Address Added Successfully",HttpStatus.CREATED);
	}
}
