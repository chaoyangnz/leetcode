
package _278_first_bad_version;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		Assert.assertEquals(1702766719, solution.firstBadVersion(2126753390));
	}
	
}
