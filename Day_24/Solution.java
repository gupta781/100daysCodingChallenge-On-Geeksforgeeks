Question:- Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

Example 1:-

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900

Example 2:-

Input:
n = 2
nums[] = {12,0}
Output:
0 12

time complexity is O(N)

class Solution 
{ 
public static long[] productExceptSelf(int nums[], int n) 
{ 
        long[] productArray = new long[n];
        
        for(int i=0;i<n;i++){
            long c=1;
            
            for(int j=0;j<n;j++){
                
                if(i!=j){
                    c*=nums[j];
                }
            }
            
            productArray[i]=c;
        }
        return productArray;
        
} 
}