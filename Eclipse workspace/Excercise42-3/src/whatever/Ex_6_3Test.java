package whatever;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex_6_3Test {

	@Test
	public void testReverse() {
		assertEquals(Ex_6_3.reverse(123),321);
		assertEquals(Ex_6_3.reverse(12321) , 12321);
		assertEquals(Ex_6_3.reverse(1), 1);
	}

	@Test
	public void testIsPaldrome() {
		assertTrue(Ex_6_3);
		assertFalse();
	}
}
