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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // use to point head of new node 
        ListNode ptr = new ListNode();

        ListNode node = ptr;
        while (l1 != null && l2 != null) {
            // based on smallest val, assign the appropriate node as next !
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        // while breaks when either l1 or l2 exhausts, thus we append remaining of either nodes to nodes next.
        node.next = l1 == null ? l2 : l1;

        return ptr.next;
    }
}