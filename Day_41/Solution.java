// A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point, the task is to find the minimum element in it.

// Example 1

// Input:
// N = 5
// arr[] = {4 ,5 ,1 ,2 ,3}
// Output: 1
// Explanation: 1 is the minimum element in the array.

class Solution
{
    int findMin(int a[], int n)
    {
        int ans =0;
        int start=0,end = n-1;
       
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(a[mid]>a[end])  start=mid+1;
            else end=mid;
        }
        
        return a[start];
    }
}
