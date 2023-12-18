Question:-Given an array of integers of size N and a number K., You must modify array arr[] exactly K number of times. Here modify array means in each operation you can replace any array element either arr[i] by -arr[i] or -arr[i] by arr[i]. You need to perform this operation in such a way that after K operations, the sum of the array must be maximum.

Example 1:-

Input:
N = 5, K = 1
arr[] = {1, 2, -3, 4, 5}
Output: 15

Example 2:-

Input:
N = 10, K = 5
arr[] = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20}
Output: 68

time complexity is O(N)

class Solution {
    public static long maximizeSum(long a[], int n, int k) {
        Arrays.sort(a);
        int i = 0;
        while (k > 0 && i < n && a[i] < 0) {
            a[i] = -a[i];
            k--;
            i++;
        }
        if (k % 2 == 1) {
            Arrays.sort(a);
            a[0] = -a[0];
        }
        long sum = 0;
        for (int j = 0; j < n; j++) {
            sum += a[j];
        }
        return sum;
    }
}