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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        } else if(list2==null){
            return list1;
        }
        
        ListNode root = new ListNode();
        root = f(list1, list2, root);
        return root.next;

    }

    public ListNode f(ListNode l, ListNode r, ListNode root){
        if(l==null){
            root.next = r;
            return root;
        } else if(r==null){
            root.next = l;
            return root;
        }
        
        if(l.val < r.val){
            root.next = l;
            f(l.next, r, root.next);
        } else{
            root.next = r;
            f(l,r.next,root.next);
        }

        return root;
        
    }

    
}