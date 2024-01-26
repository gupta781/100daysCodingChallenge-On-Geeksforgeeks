// Given a binary tree, find the Postorder Traversal of it.
// For Example, the postorder traversal of the following tree is:
// 5 10 39 1

//         1
//      /     \
//    10     39
//   /
// 5


// Example 1:

// Input:
//         19
//      /     \
//     10      8
//   /    \
//  11    13
// Output: 11 13 10 8 19



class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> a= new ArrayList<>();
       g(a,root);
       return a;
    }
    static void g(ArrayList <Integer> a, Node root){
        if(root==null) return;
        g( a,root.left);
          g( a,root.right);
          a.add(root.data);
        
    }
}
