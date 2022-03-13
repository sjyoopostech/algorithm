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
         if (list1 == null) return list2;
         if (list2 == null) return list1;

         ListNode head = new ListNode();
         if (list1.val < list2.val) {
             head.val = list1.val;
             list1 = list1.next;
         }
         else {
             head.val = list2.val;
             list2 = list2.next;
         }

         ListNode now = head;
         while (list1 != null || list2 != null) {
             if (list1 == null) {
                 now.next = list2;
                 break;
             }
             if (list2 == null) {
                 now.next = list1;
                 break;
             }

             if (list1.val < list2.val) {
                 now.next = new ListNode(list1.val);
                 list1 = list1.next;
                 now = now.next;
             }
             else {
                 now.next = new ListNode(list2.val);
                 list2 = list2.next;
                 now = now.next;
             }
         }

         return head;
    }
}