package com.example.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SampleClassTest {

	

	  private Integer inputNumber;
	  private Boolean expectedResult;
	  private SampleClass testClass;

	  @Before
	  public void initialize() {
		   testClass = new SampleClass();
	  }

	  // Each parameter should be placed as an argument here
	  // Every time runner triggers, it will pass the arguments
	  // from parameters we defined in primeNumbers() method
		
	  public  SampleClassTest(Integer inputNumber, Boolean expectedResult) {
	     this.inputNumber = inputNumber;
	     this.expectedResult = expectedResult;
	  }

	 

	  // This test will run 4 times since we have 5 parameters defined
	 

	@Parameterized.Parameters
	public static Collection primeNumbers() {
	   return Arrays.asList(new Object[][] {
	      { 3, true },
	      { 2, false },
	      { 19, true },
	      { 22, false },
	      { 23, true }
	   });
	}

	@Test
	public void testOddChecker() {
	  System.out.println("Number is : " + inputNumber);
	  assertEquals(expectedResult, 
			  testClass.odd(inputNumber));
	}
	}