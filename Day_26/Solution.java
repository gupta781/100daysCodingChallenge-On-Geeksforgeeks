Question:- Given two integers L, R, and digit X. Find the number of occurrences of X in all the numbers in the range (L, R) excluding L and R.

Example 1:-

Input:
L=10, R=19, X=1
Output: 9

Example 2:-

Input:
L=18, R=81, X=9
Output: 7

time complexity is O(N)

class Solution {
    int countX(int l, int r, int x) {
        int count = 0;
        
        for(int i = l + 1; i < r; i++) {
            int num = i;
            while(num > 0) {
                if(num % 10 == x) 
                    count++;
                
                num /= 10;
            }
        }
        
        return count;
    }
}
