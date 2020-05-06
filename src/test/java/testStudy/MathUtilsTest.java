package testStudy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAddition() {
		int expected = 6;
		
		MathUtils mathUtils = new MathUtils();
		var actual = mathUtils.add(3, 3);
		
		assertEquals(expected, actual);
	}

}
