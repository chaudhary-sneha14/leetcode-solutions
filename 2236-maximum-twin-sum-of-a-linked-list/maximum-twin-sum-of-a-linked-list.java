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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int size = 0;
        int maxSum = Integer.MIN_VALUE;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int arr[] = new int[size];
        int idx = 0;
        while (temp != null) {
            arr[idx++] = temp.val;
            temp = temp.next;
        }

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            maxSum = Math.max(maxSum, arr[i] + arr[j]);
            i++;
            j--;
        }
        return maxSum;
    }
}