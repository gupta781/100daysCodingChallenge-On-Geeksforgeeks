Question:- Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.


Example 1:

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output: Yes

Example 2:

Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output: Yes

Example 3:

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output: No

time complexity is O(n) 
class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        Map<Long, Integer> countMap = new HashMap<>();

        for (long num : a1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            long num = a2[i];
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                countMap.put(num, countMap.get(num) - 1);
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}