// Given a binary matrix your task is to find all unique rows of the given matrix in the order of their appearance in the matrix.

// Example 1:

// Input:
// row = 3, col = 4 
// M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
// Output: $1 1 0 1 $1 0 0 1 $
// Explanation: Above the matrix of size 3x4
// looks like
// 1 1 0 1
// 1 0 0 1
// 1 1 0 1
// The two unique rows are R1: {1 1 0 1} and R2: {1 0 0 1}. 
// As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.

class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        ArrayList<ArrayList<Integer>> fal = new ArrayList<>();
        int i,j;
        for(i=0; i<r; i++){
            ArrayList<Integer> al = new ArrayList<>();
            
            for(j=0; j<c; j++){
                al.add(a[i][j]);
            }
            hs.add(al);
        }
        for(i=0; i<r; i++){
            ArrayList<Integer> al = new ArrayList<>();
            
            for(j=0; j<c; j++){
                al.add(a[i][j]);
            }
            if(hs.contains(al)){
                hs.remove(al);
                fal.add(al);
            }
        }
        return fal;
    }
}
