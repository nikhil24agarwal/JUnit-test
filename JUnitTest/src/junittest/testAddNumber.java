package junittest;

import static org.junit.Assert.*;


import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int add= junit.addNumbers(200,300);
		assertEquals(500,add);
		
		
	}
	@Test
	public void test1() {
	JUnitTesting junit1 = new JUnitTesting();
	int add1= junit1.addNumbers(200,30);
	assertEquals(400,add1);
}}
