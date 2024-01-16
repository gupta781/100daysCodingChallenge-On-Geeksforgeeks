// Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

// Note: No two strings are the second most repeated, there will be always a single string.

// Example 1:

// Input:
// N = 6
// arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
// Output: bbb
// Explanation: "bbb" is the second most 
// occurring string with frequency 2.

class Solution
{
    class Pair implements Comparable<Pair>{
        String str;
        int count;
        Pair(String str,int c){
            this.str=str;
            this.count=c;
        }
        public int compareTo(Pair o)
        {
            return o.count-this.count;
        }
    }
    String secFrequent(String arr[], int N)
    {
      PriorityQueue<Pair> q=new PriorityQueue<>();    
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<N;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
       }
       for(String key: map.keySet()){
           q.add(new Pair(key,map.get(key)));
       }
       q.poll();
       return q.peek().str;
    }
}
