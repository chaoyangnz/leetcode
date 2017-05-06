
package _393_utf_8_validation;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        int[] data = {230,136,145};//{235, 140, 4};//{197, 130, 1};

        System.out.println(solution.validUtf8(data));
	}
	
}
