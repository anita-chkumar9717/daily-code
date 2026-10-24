/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null ){
            return false;
        }
        ListNode c = head;
        HashMap<ListNode, Integer> hm= new HashMap<>();
        while(c.next!=null){
            if(hm.containsKey(c)){
                return true;
            }else{
                hm.put(c,1);
                c = c.next;
            }
        } 
        return false;
        
    }
}