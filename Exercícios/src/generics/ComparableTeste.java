package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(100);
		nums.add(2);
		nums.add(4);
		nums.add(125);
		nums.add(-12);
		nums.add(05);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
		
	}

}
