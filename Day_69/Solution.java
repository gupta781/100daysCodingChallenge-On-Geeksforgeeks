// Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.
 

// Example 1:

// Input:
// N = 3 
// A[] = {1,2,3} 
// Output:
// -1
// Explanation:
// Since, each element in 
// {1,2,3} appears only once so there 
// is no majority element.



class Solution {
    static int majorityElement(int a[], int size) {
        if(size == 1){
            return a[0];
        }
        int candidate = a[0];
        int count = 1;
        for(int i=1; i<size; i++){
            if(a[i]==candidate){
                count++;
            } else{
               count--; 
            }
            if(count==0){
                candidate = a[i];
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<size; i++){
            if (a[i] == candidate){
                count++;
            }
        }
        if(count > size/2){
            return candidate;
        }
        return -1;
    }
}
