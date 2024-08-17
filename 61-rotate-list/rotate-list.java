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
    public ListNode findNthnode (ListNode temp , int k ) {
        int c=1;
        while(temp!= null) {
            if(c== k) return temp;
            c++;
            temp = temp.next;
        }
        return temp;

    }
    public ListNode rotateRight(ListNode head, int k) {
                if (head == null || head.next == null || k == 0) return head;

        int len =1;
        ListNode tail = head;
        while( tail.next!= null) {
            tail = tail.next;
            len++;
        }
         k = k % len;
        if(k==0) return head;
       

       tail.next = head;
        ListNode newHead = findNthnode(head , len-k);
        head = newHead.next;
        newHead.next = null;
        return head;
    }
}