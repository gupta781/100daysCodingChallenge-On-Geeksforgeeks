// Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).


// Example 1:

// Input:
// A = 978, B = 518, C = 300
// Output:
// 518
// Explanation:
// Since 518>300 and 518<978, so 
// 518 is the middle element.


class Solution{
    int middle(int A, int B, int C){
        long total = (A/3 + B/3 + C/3)+(A%3 + B%3 + C%3);
        int diffA = (int) Math.abs(total - A);
        int min = diffA , num = A;
        int diffB = (int) Math.abs(total - B);
        if(min > diffB){
            min = diffB;
            num = B;
        }
        int diffC = (int) Math.abs(total - C);
        if(min > diffC){
            num = C;
        }
        return num;
    }
}
