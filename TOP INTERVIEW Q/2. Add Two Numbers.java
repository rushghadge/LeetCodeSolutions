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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0);
        ListNode p=l1, q=l2, c = d;
        int carry = 0;
        while(p!=null || q!=null){
            int x = (p!=null)? p.val: 0;
            int y = (q!=null)? q.val: 0;
            int sum = x+y+carry;
            c.next = new ListNode(sum%10);
            carry = sum/10;
            c = c.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
            
        }
        if(carry >0)
            c.next = new ListNode(carry);
        return d.next;
    }
}