// Given a number n, find the value of below expression:
//             f(n-1)*f(n+1) - f(n)*f(n)    where f(n) is nth Fibonacci. 
 

// Example 1:

// Input : n = 5
// Output: -1
// Explanation: f(4) = 3, f(5) = 5
// f(6) = 8. 3 * 8 - 5 * 5 = -1


class Solution
{
    public int evaluate_exp(int n)
    {
         if(n%2==0)
         {
             return 1;
         }
         return -1;
        
    }
}
