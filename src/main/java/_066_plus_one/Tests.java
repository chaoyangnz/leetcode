
package _066_plus_one;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] digits = {0};
		System.out.println(Arrays.toString(solution.plusOne(digits)));
	}

	@Test
	public void test2() {
		int[] digits = {9,9};
		System.out.println(Arrays.toString(solution.plusOne(digits)));
	}

	@Test
	public void test3() {
		int[] digits = {8,9};
		System.out.println(Arrays.toString(solution.plusOne(digits)));
	}
}
