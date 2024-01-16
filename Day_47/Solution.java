// Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

// Example 1:

// Input:
// L = 6, N = 78
// arr[] = {5, 20, 3, 2, 5, 80}
// Output: 1
// Explanation: (2, 80) have difference of 78.

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        
       HashMap<Integer,Integer> hm = new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
           hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
       }
       if(n==0){
            for(int i=0;i<arr.length;i++){
                if(hm.get(arr[i])>=2){
                    return true;
                }
            }
       }
        else{
       for(int i=0;i<arr.length;i++){
           //hm.put(arr[i],hm.get(arr[i]-1));
           int com = n + arr[i];
           if(hm.containsKey(com)  ){
               return true;
           }
       }}
       
        return false;
    }
}
