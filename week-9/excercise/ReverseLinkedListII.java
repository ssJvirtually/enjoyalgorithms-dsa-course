/**
 * 
 * 92. Reverse Linked List II

Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 

Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n
 

Follow up: Could you do it in one pass?

 */
public class ReverseLinkedListII {
    
    static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,
            new ListNode(2,
                    new ListNode(3,
                            new ListNode(4,
                                    new ListNode(5)))));
    System.out.println("Original List:");
    printList(head1);
    head1 = reverseBetween(head1,1,3);
    System.out.println("Reversed List:");
    printList(head1);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preLeft = dummy;

        // Move to the node before the left position
        for (int i = 1; i < left; i++) {
            preLeft = preLeft.next;
        }

        ListNode leftNode = preLeft.next;
        ListNode curr = leftNode.next;

        // Reverse the nodes between left and right
        for (int i = left; i < right; i++) {
            leftNode.next = curr.next;
            curr.next = preLeft.next;
            preLeft.next = curr;
            curr = leftNode.next;
        }

        return dummy.next;
    }

     // Helper method to print the elements of a linked list
private static void printList(ReverseLinkedListII.ListNode head) {
    ReverseLinkedListII.ListNode current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
    System.out.println();
}
}
