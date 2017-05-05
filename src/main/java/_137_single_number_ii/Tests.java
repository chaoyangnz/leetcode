
package _137_single_number_ii;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
//        int[] nums = {1,2,3,1,2,3,1,2,3,100};//{-2,-2,1,1,-3,1,-3,-3,-4,-2};//{1,3,4,5,6,8,9,1,3,4,6,8,9,1,3,4,6,8,9};
//        int num = solution.singleNumber(nums);
//        System.out.println(num);

        int[] nums1 = {-2,-2,1,1,-3,1,-3,-3,-4,-2};
        System.out.println(solution.singleNumber(nums1));
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,1,2,3,1,2,3,100, 100, 100, 100, 100};//{-2,-2,1,1,-3,1,-3,-3,-4,-2};//{1,3,4,5,6,8,9,1,3,4,6,8,9,1,3,4,6,8,9};
        int num = solution.singleNumber(nums, 3, 5);
        System.out.println(num);
    }

    @Test
    public void testSwap() {
        swap(1,2);
    }

    @Test
    public void testEndecode() {
        String str = "我爱你中华";
        String str1 = encode(str, 123);
        System.out.println(str1);
        String str2 = encode(str1, 123);
    }

    public void swap(int a, int b) {
        a ^= b;
        b = a ^ b;
        a = b ^ a;
    }

    public String encode(String str, int cipher) {
	    char[] chars = str.toCharArray();
	    for(int i=0; i < chars.length; ++i) {
	        chars[i] = (char) (cipher ^ chars[i]);
        }
        return new String(chars);
    }

    public String decode(String encodedStr, int cipher) {
	    return encode(encodedStr, cipher);
    }

    @Test
    public void test11() {
	    int[] arr = {1,1,1,2,2,2,5};
        int xor = 0;
        for(int i : arr) {
            xor ^= i;
        }
            System.out.println(xor);
        System.out.println(1^2^5);
    }
}
