
package _231_power_of_two;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			if(solution.isPowerOfTwo(i)) {
				System.out.println(i);
			}
		}
	}
	
}
