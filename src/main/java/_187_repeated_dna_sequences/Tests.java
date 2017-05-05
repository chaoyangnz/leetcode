
package _187_repeated_dna_sequences;

import org.junit.Test;

import java.util.List;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> list = solution.findRepeatedDnaSequences(s);
        System.out.println(list);
    }
	
}
