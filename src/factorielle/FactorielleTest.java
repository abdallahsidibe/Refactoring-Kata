package factorielle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorielleTest {

	@Test
	void shouldReturnOneIfNumberIsOne() throws Exception {

		// GIVEN
		int input = 1;
		int expected = 1;

		// WHEN
		int result = Factorielle.facto(input);

		// THEN
		assertEquals(expected, result);
	}

	@Test
	void shouldReturnOneIfNumberIsZero() throws Exception {

		// GIVEN
		int input = 0;
		int expected = 1;

		// WHEN
		int result = Factorielle.facto(input);

		// THEN
		assertEquals(expected, result);
	}

	@Test
	void shouldReturnTwoIfNumberIsTwo() throws Exception {

		// GIVEN
		int input = 2;
		int expected = 2;

		// WHEN
		int result = Factorielle.facto(input);

		// THEN
		assertEquals(expected, result);
	}

	@Test
	void shouldReturnSixIfNumberIsThree() throws Exception {

		// GIVEN
		int input = 3;
		int expected = 6;

		// WHEN
		int result = Factorielle.facto(input);

		// THEN
		assertEquals(expected, result);
	}

	@Test
	void shouldReturnExceptionIfNumberLessThanZero() throws Throwable{
		
		 // GIVEN
		 /**
		 * -1 is an example of negative number
		 */
		int input = -1;
		String expected = "Exception Message";

		// WHEN
		Exception exception = assertThrows(Exception.class, () -> Factorielle.facto(input));

		// THEN
		assertEquals(expected, exception.getMessage());
		
	}

}
