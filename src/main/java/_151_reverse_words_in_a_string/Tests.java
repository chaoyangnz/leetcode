
package _151_reverse_words_in_a_string;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "the sky is blue";
		System.out.println("\"" + solution.reverseWords(s) + "\"");
		s = "";
		System.out.println("\"" + solution.reverseWords(s) + "\"");
		s = " ";
		System.out.println("\"" + solution.reverseWords(s) + "\"");
	}
	
}
