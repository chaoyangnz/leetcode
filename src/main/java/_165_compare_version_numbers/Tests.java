
package _165_compare_version_numbers;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		//0.1 < 1.1 < 1.2 < 13.37
		Assert.assertEquals(-1, solution.compareVersion("0.1", "1.1"));
		Assert.assertEquals(0, solution.compareVersion("0.1", "0.1"));
		Assert.assertEquals(1, solution.compareVersion("0.2", "0.1"));
		Assert.assertEquals(1, solution.compareVersion("0.1.4", "0.1"));
		Assert.assertEquals(0, solution.compareVersion("1", "1.0"));
	}
	
}
