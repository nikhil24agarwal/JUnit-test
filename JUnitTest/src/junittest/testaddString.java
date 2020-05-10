package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddString {

	@Test
	void test() {
		JUnitTesting junitS = new JUnitTesting();
		String addS= junitS.addString("nikhil", "agarwal");
		assertEquals("nikhilagarwal",addS);
	}

}
