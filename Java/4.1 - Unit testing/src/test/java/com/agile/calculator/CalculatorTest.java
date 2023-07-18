package com.agile.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
	
	Calculator calculator;

	@Test
	public void subtractFromLargerNum(){
		calculator = new Calculator();
		int result = calculator.subtract("15,3");
		Assert.assertEquals(result, 12);
	}
	
	@Test
	public void subtractFromSmallerNum(){
		calculator = new Calculator();
		int result = calculator.subtract("10,2");
		Assert.assertEquals(8, result);
	}
	
	@Test
	public void divideBySmallerNum(){
		calculator = new Calculator();
		int result = calculator.divide("10,2");
		Assert.assertEquals(result, 5);
	}
	
	@Test
	public void divideByLargerNum(){
		calculator = new Calculator();
		int result = calculator.divide("10,20");
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void multiply(){
		calculator = new Calculator();
		int result = calculator.multiply("3,11");
		Assert.assertEquals(result, 33);
	}
	
	@Test
	public void divideBadFormat(){
		calculator = new Calculator();
		int result = calculator.divide("3, 11");
		Assert.assertEquals(result, -9999);
	}
	
	@Test
	public void subBadFormat(){
		calculator = new Calculator();
		int result = calculator.subtract("3, 11");
		Assert.assertEquals(result, -9999);
	}
	
	@Test
	public void multiplyBadFormat(){
		calculator = new Calculator();
		int result = calculator.multiply("3, 11");
		Assert.assertEquals(result, -9999);
	}
}
