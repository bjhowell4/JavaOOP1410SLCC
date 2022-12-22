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
public class MethodATest {
	@Test
	void methodABrickyard() {
		assertEquals("brickyarddraykcirb", Module01.methodA("brickyard"));
	}
	@Test
	void methodAAmbient() {
		assertEquals("AmbienttneibmA", Module01.methodA("ambient"));
	}
	@Test
	void methodAJazz() {
		assertEquals("jaZZZZaj", Module01.methodA("jazz"));
	}
	@Test
	void methodA_InBrickyard() {
		assertEquals("brickyarddraykcirb", Module01.methodA("brickya_rd"));
	}
	@Test
	void methodAAmy() {
		assertEquals("AmyymA", Module01.methodA("amy"));
	}
}
