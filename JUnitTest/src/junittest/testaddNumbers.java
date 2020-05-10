package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int add= junit.addNumbers(200,300);
		assertEquals(500,add);
		}

}
