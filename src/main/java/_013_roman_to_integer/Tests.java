
package _013_roman_to_integer;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
    public void test2() {

    }

	@Test
	public void test1() {
        String str = "MCMLIV";
        System.out.println(solution.romanToInt(str));

        str = "MCMXC";
        System.out.println(solution.romanToInt(str));

        str = "MMXIV";
        System.out.println(solution.romanToInt(str));

        str = "MMMXIV";
        System.out.println(solution.romanToInt(str));

        str = "IX";
        System.out.println(solution.romanToInt(str));
    }
	
}
