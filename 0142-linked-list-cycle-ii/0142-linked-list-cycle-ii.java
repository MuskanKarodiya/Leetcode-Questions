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
    public int cycleLength(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int length =0;
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        } 
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length =0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=cycleLength(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        //find start node
        while(length>0){
            s=s.next;
            length--;
        }
        //keep moving both forward and they will meet at start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}