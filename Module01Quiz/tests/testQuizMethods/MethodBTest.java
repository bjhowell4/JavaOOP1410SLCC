/**
 * 
 */
package testQuizMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import m01.Module01;

/**
 * @author Brady H.
 *
 */
public class MethodBTest {
	@Test
	void methodBAmsterdam() {
		assertEquals(9, Module01.methodB("amsterdam"));
	}
	@Test
	void methodBEureka() {
		assertEquals(6, Module01.methodB("eurekak"));
	}
	@Test
	void methodBUeber() {
		assertEquals(4, Module01.methodB("ueber"));
	}
	@Test
	void methodBEule() {
		assertEquals(4, Module01.methodB("eule "));
	}
	@Test
	void methodBRauh() {
		assertEquals(4, Module01.methodB("rauh"));
	}
}
