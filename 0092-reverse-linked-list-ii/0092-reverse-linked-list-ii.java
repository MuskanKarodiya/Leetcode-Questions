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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right){
            return head;
        }
        ListNode c=head;
        ListNode p=null;
        for(int i=0; c!=null && i<left-1;i++){
            p=c;
            c=c.next;
        }
        ListNode last=p;
        ListNode newEnd=c;

        ListNode next=c.next;
        //reverse
        for(int i=0;c!=null && i<right-left+1;i++){
            c.next=p;
            p=c;
            c=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=p;
        }else{
            head=p;
        }
        newEnd.next=c;
        return head;
    }
}