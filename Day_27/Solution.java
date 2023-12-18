Question:- Given an array of N elements and L and R, print the number of sub-arrays such that the value of the maximum array element in that subarray is at least L and at most R.

Example 1:-

Input : 
Arr = {2, 0, 11, 3, 0}
L = 1 and R = 10
Output : 4

Example 2:-

Input : 
Arr = {3, 4, 1}
L = 2 and R = 4
Output : 5

time complexity is O(N)

class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        long count=0,windows=0;
        int left=0;
        for(int right=0;right<n;right++){
            if(a[right]>=L && a[right]<=R) windows=right-left+1;
            else if(a[right]>R){
                windows=0;
                left=right+1;
            }
            count+=windows;
        }
        return count;
    } 
}

