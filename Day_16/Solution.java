Question:-Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

Example 1:-

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3

Example 2:-
Input:
A[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1

time complexity is O(N)

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int start=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=a[i];
            while(sum>x &&start<=i){
                count=Math.min(count,i-start+1);
                sum-=a[start++];
            }
        }
        if(count==Integer.MAX_VALUE) count=0;
        return count;
    }
}