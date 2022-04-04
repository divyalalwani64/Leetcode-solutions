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
        //We can use an ArrayList to record all the nodes of the linked list. We can just swap the values of two nodes.
        ListNode temp=head;
        List<ListNode> ll=new ArrayList();
        while(temp!=null)
        {
            ll.add(temp);//adding all the nodes in arraylist.
            temp=temp.next;
        }
        //fetching nodes from arraylist and swapping the values
        int len=ll.size();
        int swap=ll.get(k-1).val;
        ll.get(k-1).val=ll.get(len-k).val;
        ll.get(len-k).val=swap;
        return head;
        
        //TC: O(n)
        //SC:O(n)- due to  arraylist
    }
}