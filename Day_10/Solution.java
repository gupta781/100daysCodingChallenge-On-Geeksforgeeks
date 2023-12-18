Question:- Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Example 1:-

Input:
LinkedList1 = 1->2->3->4->6
LinkedList2 = 2->4->6->8
Output: 2 4 6

Example 2:-

Input:
LinkedList1 = 10->20->40->50
LinkedList2 = 15->40
Output: 40

time complexity is O(N)

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
   {
        ArrayList<Integer> arr = new ArrayList<>(); 
        Node a = head1; 
        Node b = head2; 
        while(a != null && b != null)
        {
            if(a.data == b.data) 
            {
                arr.add(a.data); 
                a = a.next;  
                b = b.next;
                continue;
            }   
            else if(a.data < b.data) 
            {
                a = a.next;

            } 
            else
            {
                b = b.next;
            }
        } 
        Node dummy = new Node(0);
        Node result = dummy;
        for (int value : arr)
        {
            Node node = new Node(value);
            result.next = node;
            result = node;
        }
        return dummy.next;
    }
}