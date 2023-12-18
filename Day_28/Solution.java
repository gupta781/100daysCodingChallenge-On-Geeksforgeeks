Question:-Given an array of n integers. Find the minimum non-negative number to be inserted in array, so that sum of all elements of array becomes prime.

Example 1:-

Input:
N=5
arr = {2, 4, 6, 8, 12}
Output: 5

Example 2:-

Input:
N=3
arr = {1, 5, 7}
Output: 0 

time complexity is O(N)

class Solution
{
    public boolean isPrime(int n){
        if (n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public int minNumber(int arr[], int N)
    {
        int s=Arrays.stream(arr).sum();
        int c=s;
        while(!isPrime(s))
            s+=1;
        return s-c;
    }
}
