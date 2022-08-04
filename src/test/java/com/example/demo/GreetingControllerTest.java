package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class GreetingControllerTest {
	@Autowired
	private Employee emp;
	@Autowired
	 private GreetingController gc;
	@Before
	public void init() {
	emp = new Employee(1,"aditi","it","fullstackengineer");
	gc=new GreetingController();
	}
	@Test
	void updateDataTest() {
//		fail("Not yet implemented");
//		ResponseEntity res = new ResponseEntity<>(emp,HttpStatus.CREATED);
		System.out.println("from gretting controller test class...");
//		assertThrows(Exception.class,()->gc.updateData(emp));
		
	}

}
