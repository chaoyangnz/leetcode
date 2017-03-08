
package _292_nim_game;

import java.util.BitSet;

/**
 * https://leetcode.com/problems/nim-game
 */
public class Solution {
    public boolean canWinNim(int n) {
        if(n <= 0) return canWinNim(-n);

        BitSet bs = new BitSet();
        bs.set(1);
        bs.set(2);
        bs.set(3);
        bs.clear(4);
        bs.set(5);
        bs.set(6);

        for(int i = 7; i <= n; ++i) {
            boolean result = (bs.get(i-2) && bs.get(i-3) && bs.get(i-4)) ||
                             (bs.get(i-3) && bs.get(i-4) && bs.get(i-5)) ||
                             (bs.get(i-4) && bs.get(i-5) && bs.get(i-6));
            if(n == Integer.MAX_VALUE) return result;
//            System.out.println(result);
            bs.set(i, result);
        }

        return bs.get(n);
    }
}
