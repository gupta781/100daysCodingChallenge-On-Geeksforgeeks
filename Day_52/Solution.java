// You are given a string S, the task is to reverse the string using stack.

 

// Example 1:


// Input: S="GeeksforGeeks"
// Output: skeeGrofskeeG


class Solution {
    public String reverse(String S){
        Stack<Character> stack=new Stack<>();
        int idx=0;
        
        while(idx<S.length()){
            stack.push(S.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!stack.isEmpty()){
            char curr=stack.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

}
