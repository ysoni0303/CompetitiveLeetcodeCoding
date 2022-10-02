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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        
        for(ListNode node: lists){
            if(node != null) pq.add(node);
        }
        
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while(!pq.isEmpty()){
            ListNode newList = pq.poll();
            curr.next = newList;
            curr = curr.next;
            if(newList.next != null){
                pq.add(newList.next);
            }
        }
        return result.next;
    }
}