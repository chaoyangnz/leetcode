package _461_hamming_distance;

/**
 * https://leetcode.com/problems/hamming-distance
 */
public class Solution {
  public int hammingDistance(int x, int y) {

      int z = x ^ y;
      if(z == 0) return 0;

      int hd = 0;
      for(int i = 0; i < Integer.SIZE; ++i) {
          if(bit(z, i) == 1) ++hd;
      }
      return hd;
  }

  private int bit(int x, int i) {
      return (x >> i) & 1;
  }
}
