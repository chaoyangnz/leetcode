
package _204_count_primes;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 3;
		int count = solution.countPrimes(n);
		Assert.assertEquals(1, count);

		n = 5;
		count = solution.countPrimes(n);
		Assert.assertEquals(2, count);

		n = 10;
		count = solution.countPrimes(n);
		Assert.assertEquals(4, count);

		n = Integer.MAX_VALUE;
		System.out.println(n);
//		count = solution.countPrimes(n);
//		Assert.assertEquals(105097564, count);
	}
	
}
