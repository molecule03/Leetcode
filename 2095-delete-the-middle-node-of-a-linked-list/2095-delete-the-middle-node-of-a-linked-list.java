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
        if(head == null || head.next == null) return null;
        
        ListNode last = head;
        int i = 1;
        while(last.next != null){
            last = last.next;
            i++;
        }
        
        ListNode mid = head;
        for(int j=1; j<i/2; j++){
            mid = mid.next;
        }
        
        mid.next = mid.next.next;
        
        
        
        return head;
    }
}