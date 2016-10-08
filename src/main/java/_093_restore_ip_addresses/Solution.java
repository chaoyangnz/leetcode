
package _093_restore_ip_addresses;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<String>();

        char[] chars = s.toCharArray();
        for(int i=1111; i <= 3333; i++) {
            int i1 = i/1000;
            int i2 = (i%1000)/100;
            if(i2 != 1 && i2 != 2 && i2 != 3) continue;
            int i3 = (i%100)/10;
            if(i3 != 1 && i3 != 2 && i3 != 3) continue;
            int i4 = i%10;
            if(i4 != 1 && i4 != 2 && i4 != 3) continue;

            if(i1+i2+i3+i4 != s.length()) continue;

            String s1 = s.substring(0, i1);

            if((i1 > 1 && chars[0] == '0') || Integer.valueOf(s1) > 255) continue;
            String s2 = s.substring(i1, i1+i2);
            if((i2 > 1 && chars[i1] == '0') || Integer.valueOf(s2) > 255) continue;
            String s3 = s.substring(i1+i2, i1+i2+i3);
            if((i3 > 1 && chars[i1+i2] == '0') || Integer.valueOf(s3) > 255) continue;
            String s4 = s.substring(i1+i2+i3, i1+i2+i3+i4);
            if((i4 > 1 && chars[i1+i2+i3] == '0') || Integer.valueOf(s4) > 255) continue;
            list.add(s1 + "." + s2 + "." + s3 + "." + s4);
        }
        return list;
    }
}
