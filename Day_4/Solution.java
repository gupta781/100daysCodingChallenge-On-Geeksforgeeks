Question:- Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:-

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2

Example 2:-

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1

time complexity is O(N)

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int z=0,o=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            {
                z++;
            }
             if(a[i] == 1)
            {
                o++;
            }
             if(a[i] == 2)
            {
                t++;
            }
        }
        for(int i=0;i<z;i++)
        {
            a[i]=0;
        }
        for(int i=z;i<z+o;i++)
        {
            a[i]=1;
        }
        for(int i=o+z;i<n;i++)
        {
            a[i]=2;
        }
    }
}
