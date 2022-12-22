/**
 * 
 */
package m04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Brady H.
 *
 */
public class Module04 {

	public static void method1(List<Double> numbers) {
		
		List<Double> nums = new ArrayList<>();
		List<Double> nums2 = new ArrayList<>();
		
		//Modify list by dividing by 10
		for(int i = 0; i < numbers.size(); ++i) {
			numbers.set(i, numbers.get(i) / 10);
		}
		
		//Remove values less than 1
		numbers.forEach(n -> {
			if(n >= 1) {
				nums.add(n);
			}
		});

		//Remove all duplicate numbers from list
		Set<Double> numberSet = new HashSet<>();
		numberSet.addAll(nums);
		nums2.addAll(numberSet);

		//Empty the list
		Collections.sort(nums2, Collections.reverseOrder());

		//reassign arraylist numbers
		numbers.removeAll(numbers);
		
		//re-add
		numbers.addAll(nums2);
		
	}
	
	public static <T> List<T> method2(List<Integer> numbers) {
		
		List<String> bins = new ArrayList<>();
		List<String> bins2 = new ArrayList<>();
		Collections.rotate(numbers, -3);
		System.out.println("Shifted list: "+ numbers);
		
		// Convert to binary representation. 
		numbers.forEach(n -> bins.add(n.toBinaryString(n)));
		System.out.println("Binary conversion: " + bins);
		
		//remove all strings longer than 10 chars from list. 
		bins.forEach(v -> {
			if(v.length() <= 10) {
				bins2.add(v);
			}
			
		});
		
		return (List<T>) bins2;
		
	}

}
