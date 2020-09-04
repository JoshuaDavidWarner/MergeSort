package p1.jw2684.merge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import p1.jw2684.merge.Sorter;

class SorterTest {

	@Test
	void test0() {
		Integer [] nums = new Integer[] {};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void test1() {
		Integer [] nums = new Integer[] {42};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}

	@Test
	void test2InOrder() {
		Integer [] nums = new Integer[] {11, 42};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}	
	
	@Test
	void test2NotInOrder() {
		Integer [] nums = new Integer[] {42, 11};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);

		assertArrayEquals(exp, nums);
		
	}
	@Test
	void test2NotInOrderV2() {
		Integer [] nums = new Integer[] {42, 11,13};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);

		assertArrayEquals(exp, nums);
		
	}
	@Test
	void test2NotInOrderV3() {
		Integer [] nums = new Integer[] {42, 11,13,5};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);

		assertArrayEquals(exp, nums);
		
	}
	@Test
	void test2NotInOrderV4() {
		Integer [] nums = new Integer[] {42, 11,13,5,4654,132,54684,213,156465};
		Integer [] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);

		assertArrayEquals(exp, nums);
		
	}


}
