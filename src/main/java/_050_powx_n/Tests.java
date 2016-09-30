
package _050_powx_n;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		System.out.println(solution.myPow(8.88023, 3));
		System.out.println(solution.myPow(0, -1));
		System.out.println(solution.myPow(0, 0));
		System.out.println(solution.myPow(2.00000, -2147483648));

		System.out.println(Math.abs(Integer.MIN_VALUE));
	}
	
}
