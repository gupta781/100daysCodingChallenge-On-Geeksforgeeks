// Given a string S, check if it is palindrome or not.

// Example 1:

// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome

class Solution {
    int isPalindrome(String S) {
        char[] ch = S.toCharArray();
        for(int i=0;i<=S.length()/2;i++){
            if(S.charAt(i)!=S.charAt(S.length()-1 - i)){
                return 0;
            }
        }
        return 1;
    }
};
