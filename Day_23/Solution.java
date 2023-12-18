class Solution
{
    private static int traverse(Node node,int k){
        if(node == null) return 0;
        if(node.data == k) {
            return 1;
        }
        else if(node.data > k) return traverse(node.left,k);
        else return traverse(node.right,k);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        if(root1 == null) return 0;
        return traverse(root2,x-root1.data) + countPairs(root1.left,root2,x) + countPairs(root1.right,root2,x);
        // Code here
    }
}

