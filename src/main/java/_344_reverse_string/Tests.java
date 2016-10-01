
package _344_reverse_string;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "";
		Assert.assertEquals("", solution.reverseString(s));

		s = "hello world";
		Assert.assertEquals("dlrow olleh", solution.reverseString(s));
	}
	
}
