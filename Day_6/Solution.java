Question:- Given an array of integers, arr[] and a number, K.You can pair two numbers of the array if the difference between them is strictly less than K. The task is to find the maximum possible sum of such disjoint pairs (i.e., each element of the array can be used at most once). The Sum of P pairs is the sum of all 2P elements of pairs.

Example 1:-

Input  : 
arr[] = {3, 5, 10, 15, 17, 12, 9}
K = 4
Output : 
62

Example 2:-

Input  : 
arr[] = {5, 15, 10, 300}
K = 12
Output : 
25

time complexity is O(N)

class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 
        Arrays.sort(arr);
        int sum=0;
        int i=N-1,j=N-2;
        while(j>=0){
          if(arr[i]-arr[j]<K){
              sum=sum+arr[i]+arr[j];
                i=i-2;
                j=j-2;
                continue;
          }
          i=i-1;
          j=j-1;
       
        }
        return sum;
    }
    
}