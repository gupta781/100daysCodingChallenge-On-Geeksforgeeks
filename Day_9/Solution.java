Question:- Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:-

Input:
5
111 222 333 444 555

Output: 1

Example 2:-

Input:
3
121 131 20
 
Output: 0

time complexity is O(N)

class GfG
{
	public static int palinArray(int[] a, int n)
	{
	    int flag=0;
        for(int i=0;i<a.length;i++)
        {
            char a1[]=String.valueOf(a[i]).toCharArray();
            int start=0;
            int end=a1.length-1;
            while(start<=end)
            {
                if(a1[start]!=a1[end])
                {
                    flag=1;
                }
                start++;
                end--;
            }
            if (flag==1)
            {
                return 0;
            }
        }
        return 1;
    }
}
