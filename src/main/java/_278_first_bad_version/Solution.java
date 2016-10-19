
package _278_first_bad_version;

/**
 * https://leetcode.com/problems/first-bad-version
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high) {
            if(high - low == 1) return isBadVersion(low) ? low : high;
            int mid = (low + high) >>> 1;
            if(isBadVersion(mid))
                high = mid;
            else
                low = mid;
        }

        return low;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        return version >=1702766719;
    }
}


