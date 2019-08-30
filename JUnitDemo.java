package com.var;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class JUnitDemo {
	
	int expectedValue, actualValue;
	
	public JUnitDemo(){
		expectedValue = 0;
		actualValue = 0;
	}
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Before all test");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("After all test");
	}
	
	@Before
	public void before() {
	
		System.out.println("Before test...");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After test...");
	}
	
	@Test
	public void firstTest() {
		int expectedValue = 5;
		int actualValue = 15;
		System.out.println("Running first test");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void secondTest() {
		System.out.println("Running second");
		assertEquals(expectedValue,actualValue);
	}
}
