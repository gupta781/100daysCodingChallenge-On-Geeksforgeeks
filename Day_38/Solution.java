Question:- Given an array of N strings, find the longest common prefix among all strings present in the array.

Example 1:-

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek, geezer}
Output: gee

Example 2:-

Input: 
N = 2
arr[] = {hello, world}
Output: -1

time complexity is O(n) 

class Solution{
    String longestCommonPrefix(String arr[], int n){
        if(arr.length==1) return arr[0];
        
        String word1 = arr[0];
        String word2 = "";
        String result="";
        
        for(int i=1;i<n;i++){
            int j=0;
            result="";
            word2=arr[i];
            while(j<word1.length() && j<word2.length()){
                if(word1.charAt(j)==word2.charAt(j)) result += word1.charAt(j);
                else break;
                j++;
            }
            word1=result;
        }
      if(result=="") return "-1";
      return result;
    }
}
