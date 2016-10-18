
package _190_reverse_bits;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 43261596;
		int num = solution.reverseBits(n);
		System.out.println(num);
	}
	
}
