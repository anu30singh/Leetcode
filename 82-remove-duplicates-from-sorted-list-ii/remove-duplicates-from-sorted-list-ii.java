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
    public ListNode deleteDuplicates(ListNode head) {
          if (head == null) return null;

        HashSet<Integer> duplicates = new HashSet<>();
        ListNode current = head;

        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                duplicates.add(current.val);
            }
            current = current.next;
        }

    
        ListNode dummy = new ListNode(0); 
        ListNode newCurrent = dummy;
        current = head;

        while (current != null) {
            if (!duplicates.contains(current.val) &&
                (current.next == null || current.val != current.next.val)) {
                newCurrent.next = current;
                newCurrent = newCurrent.next;
            }
            current = current.next;
        }

        newCurrent.next = null;

        return dummy.next;
    }
}