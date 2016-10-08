
package _202_happy_number;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		System.out.println(Integer.MAX_VALUE);
		int n = 19;
		System.out.println(solution.isHappy(n));

		n = 725083991;
		System.out.println(solution.isHappy(n));

		n = 1012321673;
		System.out.println(solution.isHappy(n));

		for(int i = 1; i < Integer.MAX_VALUE; ++i) {
			if(solution.isHappy(i)) {
//				System.out.println(i);
			}

		}

	}
}
