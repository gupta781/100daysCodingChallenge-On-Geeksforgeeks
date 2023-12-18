Question:- Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.

Example 1:-

Input: 
N = 16
Output: 
16 11 6 1 -4 1 6 11 16

Example 2:-

Input: 
N = 10
Output: 
10 5 0 5 10

time complexity is O(N)

class Solution{
    public List<Integer> pattern(int N){
        // code herefo
        ArrayList<Integer> ans=new ArrayList<>();
        int k=N;
        ans.add(k);
        while(k>0)
        {
         
          k=k-5;
           ans.add(k);
        }
        while(k<=N)
        {
            if(k==N)
             return ans;
            k=k+5;
            ans.add(k);
        }
        return ans;
    }
}