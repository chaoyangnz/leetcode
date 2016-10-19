
package _205_isomorphic_strings;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		Assert.assertTrue(solution.isIsomorphic("egg", "add"));
		Assert.assertFalse(solution.isIsomorphic("foo", "bar"));
		Assert.assertFalse(solution.isIsomorphic("bar", "foo"));
		Assert.assertTrue(solution.isIsomorphic("paper", "title"));
		Assert.assertFalse(solution.isIsomorphic("aa", "ab"));
	}
	
}
