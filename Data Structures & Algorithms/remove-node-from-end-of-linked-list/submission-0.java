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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp = head;
        ArrayList<ListNode> at=new ArrayList<>();
        while(temp!=null)
        {
            
            at.add(temp);
            temp=temp.next;
        }
        int index=at.size()-n;
       if (index == 0) {
            return head.next;
        }

        
at.get(index-1).next=at.get(index).next;
return head;
    }
   
}
