// Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000

// Example 1:

// Input:
// s = V
// Output: 5

class Solution {
    public int romanToDecimal(String str) 
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int n = str.length();
        int output = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                output += map.get(str.charAt(i + 1)) - map.get(str.charAt(i));
                i++;
            } else {
                output += map.get(str.charAt(i));
            }
        }
        return output;
    }
}
