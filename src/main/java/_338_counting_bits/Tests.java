
package _338_counting_bits;

import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        int[] counts = solution.countBits(16);
        System.out.println(Arrays.toString(counts));
    }
	
}
