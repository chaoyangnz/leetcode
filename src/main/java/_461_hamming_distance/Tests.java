
package _461_hamming_distance;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
	    int x = 1, y = 4;
        System.out.println(solution.hammingDistance(x, y));
    }

    @Test
    public void test2() {
        int x = 1, y = 1;
        System.out.println(solution.hammingDistance(x, y));
    }

    @Test
    public void test3() {
        int x = 2, y = 3;
        System.out.println(solution.hammingDistance(x, y));
    }


	
}
