Question:- Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.

Example 1:-

Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
 
Example 2:-

Input :
N = 6
arr = {1, 4, 3, 2, 6, 7}
Output: 2 

time complexity is O(N)

class Solution{
    static int minJumps(int[] arr){
        int n = arr.length; 
        int dp[] = new int[n];
        
        Arrays.fill(dp, -1);
        
        dp[n-1] = 0;
        
        for(int i=n-2; i>=0; i--) {
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1; j<=i+steps && j<n; j++) {
                if(dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if(ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];
    }
}