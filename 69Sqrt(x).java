//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.


class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            // if sqrt(x) is mid
            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
