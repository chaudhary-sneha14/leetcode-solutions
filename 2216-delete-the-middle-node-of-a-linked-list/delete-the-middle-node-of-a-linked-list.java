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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null) return null;
        if(head.next.next==null){head.next=null; return head;}
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int mid=(int)Math.floor(size/2);

        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
    //    if(temp.next!=null) temp.val=temp.next.val;
       if(temp.next!=null && temp.next.next!=null)temp.next=temp.next.next;
        return head;
    }
}