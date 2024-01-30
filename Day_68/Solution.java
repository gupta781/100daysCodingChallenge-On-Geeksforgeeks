// Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.

// Example 1:

// Input:
// S = "001"
// Output: 1
// Explanation: 
// We can flip the 0th bit to 1 to have
// 101.


class Solution {
    public int minFlips(String S) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i=i+2){
            sb.append("0");
            sb.append("1");
        }
        StringBuilder sbs=new StringBuilder();
        for(int i=0;i<S.length();i=i+2){
            sbs.append("1");
            sbs.append("0");
        }
        String s1=sb.toString();
        String s2=sbs.toString();
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != s1.charAt(i)){
                count++;
            }
        }
        int count2=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != s2.charAt(i)){
                count2++;
            }
        }
        return Math.min(count,count2);
    }
}
