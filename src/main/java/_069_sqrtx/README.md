# Problem

Implement int sqrt(int x).

Compute and return the square root of x.


# Analysis

使用二分法，每次减半，时间复杂度为logN

记住，二分法通用的模式

```
while (l <= r) {
    int mid = (l+r) >> 1;
    if( .. > .. ) {
        r = mid-1; continue;
    }
    if( .. < .. ) {
        l = mid+1; continue;
    }
    
    if( .. == .. ) {
        break;
    }
}
```