// Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

// Example 1:

// Input:
// N = 5
// A[] = {-2, 1, -4, 5, 3}
// Output: 1
// Explanation: min = -4, max =  5. Sum = -4 + 5 = 1



class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        Arrays.sort(A);
        int sum=A[0] + A[N-1];
        return sum;
    }
}
