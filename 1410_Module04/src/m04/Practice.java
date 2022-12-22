package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 10, 20, 30, 40, 50, 60, 70);
		
		System.out.println("Original list: " + nums);
		
		Collections.rotate(nums, -3);
		
		System.out.println("Rotated list: " + nums);
		
		Collections.swap(nums, 1, nums.size() - 2);
		
		System.out.println("Exchanged element: " + nums);
		
		Collections.sort(nums);
		System.out.println("Sorted list: " + nums);
		int result = Collections.binarySearch(nums, 50);
		int result2 = Collections.binarySearch(nums, 10);
		System.out.printf("Number 50 is on index %d%n", result);
		System.out.printf("Number 10 is on index %d%n", result2);
		
		List<Double> list1 = new ArrayList<>();
		Collections.addAll(list1, -6.0, 102.5, 0.0, 50.0, 6.0, -2.0, 100.5);
		
		List<Double> list2 = new ArrayList<>();
		Collections.addAll(list2, 2.2, 1.0, 3.5, 5.0, (double) 100, 1.0, 4.6, 505.5, 2.2);
		
		List<Double> list3 = new ArrayList<>();
		Collections.addAll(list3, 1.0, 2.0, 3.0, 36.0, 11.0, 36.0, 11.0, 22.0, 33.0, 44.0, 55.0,
				62.0, 76.0, 81.0, 90.0);
		
		Module04.method1(list1);
		System.out.println("Test 1, Method1: "+ list1);
		
		Module04.method1(list2);
		System.out.println("Test 2, Method1: "+ list2);
		
		Module04.method1(list3);
		System.out.println("Test 3, Method1: "+ list3);
		
		List<Integer> list4 = new ArrayList<>();
		Collections.addAll(list4, 1, 3, 44, 13, 62);
		
		List<Integer> list5 = new ArrayList<>();
		Collections.addAll(list5, 45, 102, 74, 50, 12, 18);
		
		List<Integer> list6 = new ArrayList<>();
		Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("Test 1 method2: "+ Module04.method2(list4));
		System.out.println("Test 2 method2: "+ Module04.method2(list5));
		System.out.println("Test 3 method2: "+ Module04.method2(list6));

	}

}
