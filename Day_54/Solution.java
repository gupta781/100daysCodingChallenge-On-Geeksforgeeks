// Given a N x M grid. Find All possible paths from top left to bottom right.From each cell you can either move only to right or down.

// Example 1:

// Input: 1 2 3
//        4 5 6
// Output: 1 4 5 6
//         1 2 5 6 
//         1 2 3 6
// Explanation: We can see that there are 3 
// paths from the cell (0,0) to (1,2).


class Solution {

    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findPaths(n, m, grid, 0, 0, new ArrayList<>(), result);
        ArrayList<ArrayList<Integer>> result_rev = new ArrayList<>();
        for(int i = result.size() -1; i>= 0; i--){
            result_rev.add(result.get(i));
        }
        return result_rev;
    }
   

    private static void findPaths(int n, int m, int[][] grid, int i, int j, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (j + 1 < m) {
            path.add(grid[i][j]);
            findPaths(n, m, grid, i, j + 1, path, result);
            path.remove(path.size() - 1);
        }
        if (i + 1 < n) {
            path.add(grid[i][j]);
            findPaths(n, m, grid, i + 1, j, path, result);
            path.remove(path.size() - 1);
        }
        if (i == n - 1 && j == m - 1) {
            path.add(grid[i][j]);
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
    }

}
