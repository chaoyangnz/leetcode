
package _224_basic_calculator;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "1 + 1";
		System.out.println(solution.calculate(s));// 2
		s = " 2-1 + 2 ";
		System.out.println(solution.calculate(s)); // 3
		s = "(1+(4+5+2)-3)+(6+8)";
		System.out.println(solution.calculate(s)); // 23
	}
	
}
