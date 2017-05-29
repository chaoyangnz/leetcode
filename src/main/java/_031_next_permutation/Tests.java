
package _031_next_permutation;
import org.junit.*;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test public void test1() {
        int[] nums = {2,3,8,3,5,0,4};
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test public void test2() {

	}
}

