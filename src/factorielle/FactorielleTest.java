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

	// @Rule public ExpectedException thrown = ExpectedException.none();

	@Test
	void shouldReturnExceptionIfNumberLessThanZero() throws Throwable{
		
		 // GIVEN
		int input = -1;
		String expected = "Exception Message";
		Exception exception = assertThrows(Exception.class, () -> Factorielle.facto(input));
		assertEquals(expected, exception.getMessage());
		
	}

	/**
	 * @Test void shouldReturnExceptionIfNumberLessThanZero() {
	 * 
	 *       // GIVEN int input = -1; String expected = "Error";
	 * 
	 *       // WHEN int result = Factorielle.facto(input);
	 * 
	 *       // THEN try { assertEquals(expected, Factorielle.facto(input)); } catch
	 *       (Exception e) { System.out.println("Something went wrong."); } }
	 **/

}
