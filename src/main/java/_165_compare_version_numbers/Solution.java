
package _165_compare_version_numbers;

/**
 * https://leetcode.com/problems/compare-version-numbers
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] segments1 = version1.split("\\."), segments2 = version2.split("\\.");
        final int n1 = segments1.length, n2 = segments2.length;

        int i=0;
        while (i < n1 || i < n2) {
            int v1 = i < n1 ? Integer.parseInt(segments1[i]) : 0;
            int v2 = i < n2 ? Integer.parseInt(segments2[i]) : 0;
            if(v1 == v2) {
                ++i;
            } else {
                return v1 < v2 ? -1 : 1;
            }
        }

        return 0;
    }
}
