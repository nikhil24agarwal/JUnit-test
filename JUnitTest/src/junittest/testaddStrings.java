package junittest;

import static org.junit.Assert.*;


import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		JUnitTesting junitS = new JUnitTesting();
		String addS= junitS.addString("nikhil", "agarwal");
		assertEquals("nikhilagarwal",addS);
	}
	@Test
	public void test1() {
		JUnitTesting junitS1 = new JUnitTesting();
		String addS1= junitS1.addString("nikhil", "agarwal");
		assertEquals("nikhilagarwa",addS1);
	}

}
