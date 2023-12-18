Question:-Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.

 
Example 1:-

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2

Example 2:-

Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0

time complexity is O(N)

class Solution {
    void rearrange(int arr[], int n) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }

        int i = 0;
        while (i < n) {
            if (!pos.isEmpty()) {
                arr[i] = pos.poll();
                i++;
            }

            if (i < n && !neg.isEmpty()) {
                arr[i] = neg.poll();
                i++;
            }
        }
    }
}