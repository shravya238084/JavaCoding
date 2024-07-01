/*
 * 
 *There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. 
You will not be given access to the first node of head.
All the values of the linked list are unique, 
and it is guaranteed that the given node node is not the last node in the linked list.

Brute force
  
for the given list
u can take 2 variables u can copy contents from given list till the end

class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp=node;
        ListNode mover=temp.next;
        while(mover.next!=null){
            temp.val=mover.val;
            temp.next=mover;
            temp=mover;
            mover=mover.next;

        }
        temp.val=mover.val;
        temp.next=null;
    }
}

Complexity =O(n)


optimal solution

-->since we dont know the prevous node , we cannot delete the current node
--> but we can unlink next node of the given node
-->so we need to copy next data to current node data and current node next =currrent .next.next
https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

package DSA.LinkedList;

class Solution {
    public void deleteNode(ListNode node) { //Time complexity =space complexity=O(1)
   /*  space complexity=O(1) --> This deletion technique does not necessitate any extra memory allocation, as it operates 
directly on the existing nodes without creating additional data structures. */                                        
        node.val=node.next.val;  
        node.next=node.next.next;
    }
}
    

