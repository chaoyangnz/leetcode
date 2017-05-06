
package _397_integer_replacement;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        for (int n = 1; n < 20; ++n) {
            System.out.println(solution.integerReplacement(n));

            System.out.println(solution.integerReplacement1(n));
            System.out.println("------------");
        }

    }
	
}
