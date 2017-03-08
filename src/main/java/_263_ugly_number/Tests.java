
package _263_ugly_number;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
	    for(int i=1; i < 100; ++i) {
            System.out.printf("%d: %b\n", i, solution.isUgly(i));
        }

    }
	
}
