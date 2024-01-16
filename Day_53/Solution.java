// Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
// For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

// Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

// Example 1:

// Input:
// {([])}
// Output: 
// true
// Explanation: 
// { ( [ ] ) }. Same colored brackets can form 
// balanced pairs, with 0 number of 
// unbalanced bracket.


class Solution
{
    static boolean ispar(String x)
  {
        HashMap<Character,Character> m=new HashMap<Character,Character>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        Stack<Character> s=new Stack<Character>();
        int n=x.length();
        for(int i=0;i<n;i++){
           if(!s.isEmpty() && m.get(x.charAt(i))==s.peek())
           s.pop();
           else
           s.push(x.charAt(i));
        }
        return s.isEmpty();
    }
}
