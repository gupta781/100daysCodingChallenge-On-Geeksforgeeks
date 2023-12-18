Question:- Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:-

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2

Example 2:-

Input: 
N = 1
Arr[] = {1}
Output: 1

time complexity is O(N)

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (i+1 == arr[i]){
                Arr.add(i+1);
            }
        }
        return Arr;
    }
}
