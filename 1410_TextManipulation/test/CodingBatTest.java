import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import codingBat.CodingBat;

public class CodingBatTest {
	@Test
	void test1() {
		assertEquals(CodingBat.wordEnds("abcXY123XYijk", "XY"), "c13i");
	
	}
	@Test
	void test2() {
		assertEquals(CodingBat.wordEnds("XY123XY", "XY"), "13");
		
	}
	@Test
	void test3() {
		assertEquals(CodingBat.wordEnds("XY1XY", "XY"), "11");
		
	}
	@Test
	void test4() {
		assertEquals(CodingBat.wordEnds("XYXY", "XY"), "XY");
		
	}
	@Test
	void test5() {
		assertEquals(CodingBat.wordEnds("XY", "XY"), "");
		
	}
	@Test
	void test6() {
		assertEquals(CodingBat.wordEnds("Hi", "XY"), "");
		
	}
	@Test
	void test7() {
		assertEquals(CodingBat.wordEnds("", "XY"), "");
		
	}
	@Test
	void test8() {
		assertEquals(CodingBat.wordEnds("abc1xyz1i1j", "1"), "cxziij");
		
	}
	@Test
	void test9() {
		assertEquals(CodingBat.wordEnds("abc1xyz1", "1"), "cxz");
		
	}
	@Test
	void test10() {
		assertEquals(CodingBat.wordEnds("abc1xyz11", "1"), "cxz11");
		
	}
	@Test
	void test11() {
		assertEquals(CodingBat.wordEnds("abc1xyz1abc", "abc"), "11");
		
	}
	@Test
	void test12() {
		assertEquals(CodingBat.wordEnds("abc1xyz1abc", "b"), "acac");
		
	}
	@Test
	void test13() {
		assertEquals(CodingBat.wordEnds("abc1abc1abc", "abc"), "1111");
		
	}
}
