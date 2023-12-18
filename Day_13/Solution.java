Question:- Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:-

Input:
Str = geeksforgeeks
Output: geksfor

Example 2:-

Input:
Str = HappyNewYear
Output: HapyNewYr

time complexity is O(N)

class Solution {
    String removeDuplicates(String str) {
        StringBuilder ans = new StringBuilder();
        HashSet<Character> st = new HashSet<>();
        st.add(str.charAt(0));
        ans.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(!st.contains(str.charAt(i))){
                ans.append(str.charAt(i));
            }
            st.add(str.charAt(i));
        }
        return ans.toString();
    }
}