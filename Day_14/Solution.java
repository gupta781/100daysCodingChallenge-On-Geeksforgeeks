Question:- Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.

Example 1:-

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output: 2

Example 2:-

Input:
N = 4
arr = [2,3,3,2]
k = 3
Output: 2

time complexity is O(N)

class Solution 
{
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        int r=n/k;
        for(int i : map.values()){
            if(i > r){
                c++;
            }
        }
        return c;
    }
}