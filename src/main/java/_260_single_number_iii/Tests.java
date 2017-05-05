
package _260_single_number_iii;

import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
	    int[] nums = {-1,3,-5,-1,-9,-5,3,10};//{1,2,1,3,2,5};
        System.out.println(Arrays.toString(solution.singleNumber(nums)));
	}
	
}
