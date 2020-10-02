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

import com.example.bank.entity.Branch;
import com.example.bank.service.BranchService;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("branch")
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@GetMapping("/home")
	public String home() {
		return "In Branch home";
	}
	
	@GetMapping("/getAllBranches")
	public ResponseEntity<List<Branch>> getAllBranches() {
		List<Branch> branchList=branchService.getAllBranches();
		return new ResponseEntity<List<Branch>>(branchList,HttpStatus.OK);
	}
	
	@RequestMapping(value="/addBranch",method=RequestMethod.PUT)
	public ResponseEntity<String> addBranch(@RequestBody Branch branch) {
		Branch b=this.branchService.addBranch(branch);
		return new ResponseEntity<String>("Branch Added Successfully",HttpStatus.CREATED);
	}
	
}
