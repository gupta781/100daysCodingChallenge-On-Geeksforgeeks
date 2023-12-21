Question:- Given an array a[ ] of N elements. Consider array as a circular array i.e. element after an is a1. The task is to find maximum sum of the absolute difference between consecutive elements with rearrangement of array elements allowed i.e. after any rearrangement of array elements find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.

Example 1:-

Input:
N = 4
a[] = {4, 2, 1, 8}
Output: 
18

Example 2:-

Input:
N = 2
a[] = {10, 12}
Output: 
4

time complexity is O(N)

class GFG
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        int b = 0;
        int l = n-1;
        long sum = 0;
        while(b<=l){
            sum+=Math.abs(arr[b]-arr[l]);
            b++;
            l--;
        }
        return 2*sum;
    }
}