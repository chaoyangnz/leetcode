package _001_two_sum;

import org.junit.Test;

public class Solve {

    public void solve(int[] arr, int k) {
        int lb = -1, ub = arr.length;
        while(ub-lb > 1) {
            int mid = (lb + ub)/2;
            if(arr[mid] >= k) {
                ub = mid;
            } else {
                lb = mid;
            }
            System.out.println(String.format("%d (%d, %d]", mid, lb, ub));
        }

        System.out.println(ub);
    }

    @Test
    public void test() {
        int[] arr = {2, 3, 3, 5, 6};
        solve(arr, 3);
    }
}
