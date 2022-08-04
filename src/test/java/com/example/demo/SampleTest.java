//package com.example.demo;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//class SampleTest {
//
//	public boolean odd(int i)
//	{
//	if(i%2==0)	
//		return false;
//				return true;
//	}
//}
//@RunWith(Parameterized.class)
//class OddTest {
//  private Integer inputNumber;
//  private Boolean expectedResult;
//  private SampleTest testClass;
//
//  @Before
//  public void initialize() {
//	   testClass = new SampleTest();
//  }
//
//  // Each parameter should be placed as an argument here
//  // Every time runner triggers, it will pass the arguments
//  // from parameters we defined in primeNumbers() method
//	
//  public  OddTest(Integer inputNumber, Boolean expectedResult) {
//     this.inputNumber = inputNumber;
//     this.expectedResult = expectedResult;
//  }
//
// 
//
//  // This test will run 4 times since we have 5 parameters defined
// 
//
//@Parameterized.Parameters
//public static Collection primeNumbers() {
//   return Arrays.asList(new Object[][] {
//      { 3, true },
//      { 2, false },
//      { 19, true },
//      { 22, false },
//      { 23, true }
//   });
//}
//
//@Test
//public void testOddChecker() {
//  System.out.println("Parameterized Number is : " + inputNumber);
//  assertEquals(expectedResult, 
//		  testClass.odd(inputNumber));
//}
//}