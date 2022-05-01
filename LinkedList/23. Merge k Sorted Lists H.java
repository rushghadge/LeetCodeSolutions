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

public ListNode mergeKLists(ListNode[] lists) {
   Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>() {  
        @Override
        public int compare(ListNode o1, ListNode o2) {
            // TODO Auto-generated method stub
            return o1.val-o2.val;
        }
        };
 
        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
       // adds iitiall all values from list
        for(ListNode l : lists){
            if(l!=null){
          System.out.println(" l: "+l.val);

                q.add(l);
            }        
        }
    
    //initialize node (0) , also point a pointer point to head 
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty()){ 
            // fetch smallest, since queue is sorted in ascending order 
            point.next = q.poll();
            System.out.println("-- "+point.val);
        // increment the pointer and point to actual value poled from queue
            point = point.next; 
            // next node of this pointer will be the val next in the list , store it in new node and add to queue 
            ListNode next = point.next;
 // System.out.println("nxt "+next.val);

            if(next!=null){
                 System.out.println("nxt "+next.val);

                q.add(next);
            }
        }
        return head.next;
}
}