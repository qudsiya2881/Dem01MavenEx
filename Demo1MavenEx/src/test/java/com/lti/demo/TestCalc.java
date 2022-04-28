package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestCalc {

	Calculator c=new Calculator();
	@Disabled
	@Test
	public void testHello() {
		Assertions.assertEquals("hello world", c.sayHello());
		
	}
	@Disabled
	@Test
	public void testAddition() {
		Assertions.assertEquals(500, c.addNos(300, 200));
	}
	@Disabled
	@Test
	public void testSubstract() {
		Assertions.assertEquals(100, c.subNos(200, 100),"test case pass");
	}
	@Disabled
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);
		Assertions.assertEquals(2, al.size());
		// assertFalse(al.isEmpty());
		}
	
	

}



//ctrl+shift+o --->import automatic
