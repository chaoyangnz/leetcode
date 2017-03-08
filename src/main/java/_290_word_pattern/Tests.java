
package _290_word_pattern;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        String pattern = "abba";
        String str = "dog cat cat dog";

        Assert.assertTrue(solution.wordPattern(pattern, str));
	}
	
}
