package m04;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestModule04 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void Method1_DivideBy10() {
		List<Double> expected = new ArrayList<>();
		List<Double> actual = new ArrayList<>();
		Collections.addAll(actual, -6.0, 102.5, 0.0, 50.0, 6.0, -2.0, 100.5);
		Module04.method1(actual);
		Collections.addAll(expected, 10.25, 10.05, 5.0);
		assertEquals(expected, actual);
	}
	@Test
	void Method1_RemoveLessThanOne() {
		List<Double> expected = new ArrayList<>();
		List<Double> actual = new ArrayList<>();
		Collections.addAll(actual, 1.0,1.0,1.0,10.0,100.0,1000.0);
		Module04.method1(actual);
		Collections.addAll(expected, 100.0, 10.0, 1.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void Method1_SortInDescendingOrder() {
		List<Double> expected = new ArrayList<>();
		List<Double> actual = new ArrayList<>();
		Collections.addAll(actual, 10.0,20.0,30.0,40.0,50.0);
		Module04.method1(actual);
		Collections.addAll(expected, 5.0, 4.0, 3.0, 2.0, 1.0);
		assertEquals(expected, actual);
	}

	@Test
	void Method2_ShiftElementsLeft3Times() {
		List<String> expected = new ArrayList<>();
		List<Integer> actual = new ArrayList<>();
		Collections.addAll(actual, 4,5,6,1,2,3);
		Collections.addAll(expected, "1", "10", "11", "100", "101", "110");
		assertEquals(expected,Module04.method2(actual));
	}
	@Test
	void Method2_CreateBinaryRepresentation() {
		List<String> expected = new ArrayList<>();
		List<Integer> actual = new ArrayList<>();
		Collections.addAll(actual, 1,1,1,1,2);
		Collections.addAll(expected, "1","10","1","1","1");
		assertEquals(expected,Module04.method2(actual));
	}
	
	@Test
	void Method2_RemoveOver10Chars() {
		List<String> expected = new ArrayList<>();
		List<Integer> actual = new ArrayList<>();
		Collections.addAll(actual, 1,1,100001,220023,562147);
		Collections.addAll(expected, "1","1");
		assertEquals(expected,Module04.method2(actual));
	}

}
