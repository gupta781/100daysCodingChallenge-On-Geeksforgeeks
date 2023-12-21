Question:- You are given an array Arr of size N containing non-negative integers. Your task is to choose the minimum number of elements such that their sum should be greater than the sum of the rest of the elements of the array.

Example 1:-

Input:
N = 4 
Arr[] = {2, 17, 7, 3}
Output:
1

Example 2:-

Input:
N = 4
Arr = {20, 12, 18, 4}
Output:
2

time complexity is O(N)

class Solution { 
    int minSubset(int[] Arr,int N) { 
        long sum = 0;
        for(int i=0; i<N; i++){
            sum = sum + (long)Arr[i];
        }
        Arrays.sort(Arr);
        long outsideSum = 0;
        for(int i=N-1; i>=0; i--){
            outsideSum = outsideSum + (long)Arr[i];
            sum = sum - (long)Arr[i];
            if(sum<outsideSum){
                return N-i; 
            }
        }
        return N;
    }
}