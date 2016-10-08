
package _093_restore_ip_addresses;

import org.junit.Test;

import java.util.Collections;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "25525511135";
		System.out.println(solution.restoreIpAddresses(s));
		s = "0000";
		System.out.println(solution.restoreIpAddresses(s));
	}
}
