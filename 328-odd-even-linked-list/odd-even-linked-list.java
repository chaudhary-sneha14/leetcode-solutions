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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);

        ListNode etemp = even;
        ListNode otemp = odd;
        ListNode temp = head;

        while (temp != null) {
            otemp.next = temp;
            otemp = otemp.next;
            temp = temp.next;

            if (temp != null) {
                etemp.next = temp;
                etemp = etemp.next;
                temp = temp.next;
            }
        }

        etemp.next = null;
        otemp.next = even.next;
        return odd.next;

    }
}