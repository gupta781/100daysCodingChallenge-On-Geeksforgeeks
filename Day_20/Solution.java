Question:-Consider a directed graph whose vertices are numbered from 1 to n. There is an edge from a vertex i to a vertex j if and only if either j = i + 1 or j = 3 * i. The task is to find the minimum number of edges in a path from vertex 1 to vertex n.

Example 1:-

Input:
n = 9
Output: 2

Example 2:-

Input:
n = 4
Output: 2

time complexity is O(N)

class Solution{
    public int minStep(int n)
    {
        int c=0;
        while(n!=1){
            if(n%3==0) {n=n/3;}
            else{
            n--;}
            c++;
            
        } return c;
       
    }
}