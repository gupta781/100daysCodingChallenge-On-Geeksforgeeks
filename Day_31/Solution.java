Question:- You are given two arrays A and B of equal length N. Your task is to pair each element of array A to an element in array B, such that the sum of the absolute differences of all the pairs is minimum.

Example 1:-

Input:
N = 4
A = {4,1,8,7}
B = {2,3,6,5}
Output:
6

Example 2:-

Input:
N = 3
A = {4,1,2}
B = {2,4,1}
Output:
0

time complexity is O(N)

class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        long sum=0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<N;i++){
            sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
}