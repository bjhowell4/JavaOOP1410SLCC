/**
 * 
 */
package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Brady H.
 *
 */
public class HarmonicTest {
	@Test
	void test1() {
		assertEquals(3.4951080781963135, Recursion.harmonic(18));
	}
	
	@Test
	void test2() {
		assertEquals(-1.5, Recursion.harmonic(-2));
	}
	
	@Test
	void test3() {
		assertEquals(1, Recursion.harmonic(1));
	}
	
	@Test
	void test4() {
		assertEquals(4.302933282838815, Recursion.harmonic(41));
	}
	
	@Test
	void test5() {
		assertEquals(5.235930361310531, Recursion.harmonic(105));
	}
}
