
package _125_valid_palindrome;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "A man, a plan, a canal: Panama";
		Assert.assertTrue(solution.isPalindrome(s));

		s = "";
		Assert.assertTrue(solution.isPalindrome(s));

		s = "race a car";
		Assert.assertFalse(solution.isPalindrome(s));

	}
	
}
