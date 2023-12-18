Question:-Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

Example 1:-
Input: 
arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
Output:
15 7 5 3 9 6 2 4 32

Example 2:-
Input: 
arr[] = {1, 2, 3, 4, 5, 6};
Output: 
3 5 6 1 2 4

time complexity is O(N)

class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            int num = arr[i], res = 0;
            while(num > 0){
                num = num & (num-1);
                res++;
            }
            map.computeIfAbsent(res, k -> new ArrayList<>()).add(arr[i]);
        }
        int k = n-1;
        for(ArrayList<Integer> group: map.values()){
            ArrayList<Integer> list = group;
            
            while(!list.isEmpty()){
                arr[k] = list.remove(list.size()-1);
                k--;
            }
        }
    } 
}
