// Given a Binary Search Tree. The task is to find the minimum valued element in this given BST.

// Example 1:

// Input:
//            5
//          /    \
//         4      6
//        /        \
//       3          7
//      /
//     1
// Output: 1


class Tree {
    int minValue(Node node) {
       if(node==null){
           return -1;
       }
       while(node.left!=null){
           node=node.left;
       }
       return node.data;
    }
}
