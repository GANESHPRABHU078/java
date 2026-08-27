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
    public void reorderList(ListNode head) {
        ListNode mid =middle(head);
        ListNode h1=head;
        ListNode h2=mid.next;
        mid.next=null;
        h2=reverse(h2);
        while(h1!=null&&h2!=null){
            ListNode temp1 = h1.next;
            ListNode temp2 = h2.next;
            h1.next = h2;
            h2.next = temp1;
            h1 = temp1;
            h2 = temp2;;
        }
    }

   ListNode middle(ListNode head){
         ListNode s=head;
         ListNode f=head;
         while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
         }
         return s;
    }
   ListNode reverse(ListNode mid){
           ListNode prev=null;
           ListNode curr=mid;
           while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
           prev=curr;
           curr=next;
        }
            return prev;
    }
}
