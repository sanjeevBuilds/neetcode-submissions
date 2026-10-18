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
    public void reorderList(ListNode head)
     {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current=head;

        ArrayList<ListNode> lt =new ArrayList<>();
        while(current != null)
        {
            lt.add(current);
            current=current.next;
        }
int left=0;
int right =lt.size()-1;
  while (left<right)
  {
    lt.get(left).next=lt.get(right);
    left++;

     if(left==right)
     {
        break;
     }
    lt.get(right).next=lt.get(left);
    right--;
    
  }
       lt.get(left).next = null;
    }
}
