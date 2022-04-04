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
        ListNode temp=head,slow=null,fast=null;
        int len=0,count=0;
        while(temp!=null)
        {
           len++;
           temp=temp.next;      
        }
        temp=head;
        while(temp!=null)
        {
            if(count==k-1)
                slow=temp;
            if(count== len-k)
                fast=temp;
            count++;
            temp=temp.next;
        }
        int swap=slow.val;
        slow.val=fast.val;
        fast.val=swap;
        return head;
        
        
    }
}