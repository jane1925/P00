import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a =1234;
		int b= 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals(expected, actual);
		
	}//end of testAdd()
	
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a =9876;
		int b= 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
		
	}//end of testSubtract()

	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a =12;
		int b= 12;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 144;
		assertEquals(expected, actual);
		
	}//end of testMultiple()
	
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a =50;
		int b= 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 25;
		assertEquals(expected, actual);
		 
	}//end of testDivide()
	
	
	@Test
	public void testDivideByZero() {
		//fail("Not yet implemented");
		int a =50;
		
		Calculator cal = new Calculator();
		int actual = cal.divideByZero(a);
		
		int expected = 0;
		assertEquals(expected, actual);
		 
	}//end of testDivide()

	
}//end of class
