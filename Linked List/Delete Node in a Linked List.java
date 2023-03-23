/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp =node.next.next;
        int data = node.next.val;
        node.val = data;
        node.next = temp;
    }
}
