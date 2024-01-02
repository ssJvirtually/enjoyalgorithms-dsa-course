package tech.ssjvirtually.LinkedList;


public class SortList {

    static class ListNode {
        int val;
        ListNode next;

        // Constructors
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        // Test Case 1: Reverse a simple linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        System.out.println("Original List:");
        printList(head1);
        sortList(head1);
        System.out.println("sorted List:");
        printList(head1);
    }

    public  static  ListNode sortList(ListNode head) {

        //brute force
     /*
    store them in tree map comparing the value of the node
    then re arrange the nodes
     */

        int count = 0;
        int max = Integer.MIN_VALUE;

        ListNode curr = head;
        ListNode currNext = curr.next;
        while(curr != null){
            count++;
            if(curr.val < max){
                currNext = curr.next;
                curr = swap(head,curr,count);
                curr.next = currNext;
            }
            else{
                max = curr.val;
            }
            curr = currNext;

        }

        return head;


    }

    public static ListNode swap(ListNode head, ListNode node, int count){
        int counter = 0;
        ListNode curr =  head;
        ListNode currNext = curr.next;
        while(counter < count){
            if(curr.val < node.val && currNext.val > node.val){
                curr.next = node;
                node.next = currNext;
                break;
            }
            curr =  currNext;
            currNext = curr.next;
            counter++;
        }
        return currNext;
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
