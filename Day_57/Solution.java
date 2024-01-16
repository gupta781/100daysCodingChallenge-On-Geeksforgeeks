// Given a binary tree, find its preorder traversal.

// Example 1:

// Input:
//         1      
//       /          
//     4    
//   /    \   
// 4       2
// Output: 1 4 4 2 


class BinaryTree
{
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList <Integer> ans= new ArrayList<>();
        giv(ans,root);
        return ans;
    }
    static void giv(ArrayList <Integer> a , Node root){
        if(root==null) return;
        a.add(root.data);
        giv(a,root.left);
        giv(a,root.right);
    }

}
