// Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.

// Example 1:

// Input: 
// N = 8
// Output: 
// YES
// Explanation:
// 8 is equal to 2 raised to 3 (23 = 8).


class Solution{
    public static boolean isPowerofTwo(long n){
        double x;
        if(n==1) {
            return true;
        }
        for(int i=1;i<=100;i++) {
            x=Math.pow(2, i);
            if(x==n) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }
}
