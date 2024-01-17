// Given a Binary Tree, find the In-Order Traversal of it.

// Example 1:

// Input:
//        1
//      /  \
//     3    2
// Output: 3 1 2


class Solution {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>a=new ArrayList<>();
        sol(a,root);
        return a;
    }
    public void sol(ArrayList<Integer>a,Node root){
        if(root==null){
            return;
        }
        else{
        sol(a,root.left);
        a.add(root.data);
        sol(a,root.right);
        }
    }
}
