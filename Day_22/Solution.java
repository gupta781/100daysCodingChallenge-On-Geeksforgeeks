Question:- Given an array arr of size N, determine whether this array represents an inorder traversal of a BST. 

Note: All keys in BST must be unique.

Example 1:-

Input:
N = 3
arr = {2, 4, 5}
Output: 1

Example 2:-

Input:
N = 3
arr = {2, 4, 1}
Output: 0

time complexity is O(N)

class Solution
{
    static int isRepresentingBST(int arr[], int n)
    {
        for(int i = 1; i < n; i++)
            if(arr[i - 1] > arr[i])
                return 0;
                
        return 1;
    }
}