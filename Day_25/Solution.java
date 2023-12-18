Question:- Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
You are allowed to rearrange the elements of the array.

Example 1:-

Input : Arr[] = {5, 3, 2, 4, 1}
Output : 40

Example 2:-

Input : Arr[] = {1, 2, 3}
Output : 8

time complexity is O(N)

class Solution{
    
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);

        long ans=0;

        for(long i=0;i<n;i++){

            ans+=(arr[(int)i]*i);

            ans=ans%1000000007;

        }

        return (int)ans%1000000007;
    }   
}



