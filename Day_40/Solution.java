// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?

// Example 1:

// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> li = new ArrayList<>();
        int i = 0 ,j=0 ,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && A[i]==C[k]){
                li.add(A[i]);
                // Move pointers to skip duplicate values
                while (i + 1 < n1 && A[i] == A[i + 1]) i++;
                while (j + 1 < n2 && B[j] == B[j + 1]) j++;
                while (k + 1 < n3 && C[k] == C[k + 1]) k++;
                i++;
                j++;
                k++;
            }else if(A[i]<B[j] || A[i]<C[k]){
                i++;
            }else if(B[j]<A[i] || B[j]<C[k]){
                j++;
            }else{
                k++;
            }
        
        }
        return li;
    }
}
