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

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        ListNode current = head;

        // First pass: Identify duplicates
        while (current != null) {
            if (seen.contains(current.val)) {
                duplicates.add(current.val);
            } else {
                seen.add(current.val);
            }
            current = current.next;
        }

        // Second pass: Remove duplicates
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        ListNode newCurrent = dummy;

        current = head;
        while (current != null) {
            if (!duplicates.contains(current.val)) {
                newCurrent.next = current;
                newCurrent = newCurrent.next;
            }
            current = current.next;
        }

        newCurrent.next = null; // Ensure the last node's next is null

        return dummy.next;
    
    }
}