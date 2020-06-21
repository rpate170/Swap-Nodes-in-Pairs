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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = null;
        head = head.next;
        while (prev != null & curr != null) {
            prev.next = curr.next;
            curr.next = prev;
            
            if (temp != null){
                temp.next = curr;
            }
            curr = prev;
            
            if (curr.next != null && curr.next.next != null){
                prev = curr.next;
                temp = curr;
                curr = curr.next.next;
            } else {
                curr = null;
            }
        }
        
        return head;
    }
}