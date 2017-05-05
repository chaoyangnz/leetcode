
package _268_missing_number;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        long a = 1L * Integer.MAX_VALUE * Integer.MAX_VALUE;
        int[] nums = range(Integer.MAX_VALUE-8, 89);

        System.out.println(solution.missingNumber(nums));
    }

	int[] range(int n, int i) {
        List<Integer> list = new ArrayList<>();
	    int[] arr = new int[n];
	    for(int j=0; j <= n; j++) {
	        if(j != i) list.add(j);
        }
        for(int j=0; j < n; ++j) {
	        arr[j] = list.get(j);
        }
        return arr;
    }
	
}
