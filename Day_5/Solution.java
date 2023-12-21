Question:- Given an integer, check whether it is a palindrome or not.

Example 1:

Input: n = 555
Output: Yes

Example 2:

Input: n = 123
Output: No

time complexity is O(N)

class Solution
{
    public String is_palindrome(int n)
    {
          String str = Integer.toString(n);
        String t="";
        for(int i=str.length()-1; i>=0; i--){
            t=t+str.charAt(i);
        }
        if(str.equals(t)){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}

