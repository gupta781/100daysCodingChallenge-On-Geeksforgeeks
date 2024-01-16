// In a candy store, there are N different types of candies available and the prices of all the N different types of candies are provided to you.
// You are now provided with an attractive offer.
// For every candy you buy from the store and get K other candies ( all are different types ) for free.
// Now you have to answer two questions. Firstly, you have to find what is the minimum amount of money you have to spend to buy all the N different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the N different candies.
// In both the cases you must utilize the offer i.e. you buy one candy and get K other candies for free.

// Example 1:

// Input:
// N = 4
// K = 2
// candies[] = {3 2 1 4}

// Output:
// 3 7

// Explanation:
// As according to the offer if you buy 
// one candy you can take at most two 
// more for free. So in the first case, 
// you buy the candy which costs 1 and 
// takes candies worth 3 and 4 for free, 
// also you buy candy worth 2 as well.
// So min cost : 1+2 =3.
// In the second case, you can buy the 
// candy which costs 4 and takes candies 
// worth 1 and 2 for free, also you need 
// to buy candy worth 3 as well. 
// So max cost : 3+4 =7.


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        
        ArrayList<Integer> res=new ArrayList<>();
        if(K==0){
            int x=0;
            for(int i:candies){
                x+=i;
            }
            res.add(x);
            res.add(x);
            return res;
        }
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:candies){
            p.add(i);
        }
        ArrayList<Integer> inc=new ArrayList<>();
        while(p.size()>0){
            inc.add(p.poll());
        }
        int i=0;
        int j=inc.size()-1;
        int min=0;
        while(i<=j){
            min+=inc.get(i);
            j-=K;
            i++;
            }
        res.add(min);
        
        Collections.reverse(inc);
        int l=0;
        int m=inc.size()-1;
        int max=0;
        while(l<=m){
            max+=inc.get(l);
            m-=K;
            l++;
            }
        res.add(max);
        return res;
        
    }
}
