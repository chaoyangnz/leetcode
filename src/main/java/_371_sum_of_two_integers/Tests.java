
package _371_sum_of_two_integers;

import _000_util.BinaryUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        int sum = solution.getSum(Integer.MAX_VALUE-1,2);
        System.out.println(sum);
        System.out.println(BinaryUtil.toBinary(sum, Integer.SIZE));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE-1 + 2);
    }
	
}
