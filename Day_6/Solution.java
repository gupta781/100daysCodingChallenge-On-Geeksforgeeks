Question:- You are given a string s, you need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof

time complexity is O(N)

class Reverse
{
   public static String reverseWord(String str)
    {
        // Reverse the string str
        String s="";
        for(int i=str.length()-1;i>=0;i--){
           s=s+str.charAt(i);
        }
       return s;
    }
}
