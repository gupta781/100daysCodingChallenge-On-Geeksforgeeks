Question:- Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:-

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9

Example 2:-

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1

time complexity is O(N)

class Solution{
    long maxSubarraySum(int arr[], int n){
       long maxi = arr[0]; long sum=0; 
        for(int i=0;i<n;i++){
            sum +=arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0){
             sum = 0;
            }
        }
        return maxi;
        
    }
    
}