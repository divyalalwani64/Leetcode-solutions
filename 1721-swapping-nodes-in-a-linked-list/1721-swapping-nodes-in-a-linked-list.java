/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        //Two-pointer approach
        //Find the k-th node from the front which is left.
        //Make left node as the current node, right node from the front, when the current node reach end, right node is just the k-th last element.
       //Swap their values.
        ListNode left=head;
        ListNode right=head;
        int count=0;
        while(left!=null)
        {
            count++;
            if(count==k)
                break;
            left=left.next;//left node
        }
        ListNode current=left;
        while(current.next!=null)
        {
            current=current.next;
            right=right.next;//right node
        }
        //swapping their values
        int swap=left.val;
        left.val=right.val;
        right.val=swap;
        return head;
    }
}