package testStudy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAddition() {
		int expected = 6;
		
		MathUtils mathUtils = new MathUtils();
		var actual = mathUtils.add(3, 3);
		
		assertEquals(expected, actual, "Should add two numbers");
	}
	
	@Test
	void testAreaCircle() {
		double expected = 2463.01;
		
		MathUtils mathUtil = new MathUtils();
		double actual = mathUtil.computeCircleArea(28);
		
		assertEquals(expected, actual, "Compute area of circle");
	}
	
}
