
package _191_number_of_1_bits;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n =  Integer.MIN_VALUE;
		System.out.println(solution.hammingWeight(n));
        System.out.println(1 << 31);
        System.out.println(n & n);
    }
	
}
