/*
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]

 */

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    
  //Definition for singly-linked list.
  public static class ListNode {
      int val;
      ListNode next;
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
    head1 = reverseListWithoutExtraMemory(head1);
    System.out.println("Reversed List:");
    printList(head1);
  }



    /**
    Add all nodes to list , then traverse list from the end
     */
    public static ListNode reverseList(ListNode head) {
    
    //brute force approch
    List<ListNode> nodes = new ArrayList();

    nodes.add(head);
    
    while(head != null && head.next != null){ //add all nodes to the list
        nodes.add(head.next);
        head = head.next;
    }

    int n = nodes.size();
    head = nodes.get(n-1);
    for(int i=n-2;i>=0;i--){    //loop from end of list and connect the nodes
       
       ListNode prevNode = nodes.get(i+1);
       ListNode CurrNode = nodes.get(i);

       prevNode.next = CurrNode;

       if(i==0){
           CurrNode.next = null;
       }
    
    }
    return head;

    }


    public static ListNode reverseListWithoutExtraMemory(ListNode head) {
       
        ListNode prev = null;
        ListNode curr = head;
        ListNode currNext = head ;
        
        while(currNext != null){
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            if(currNext != null){
            curr = currNext;
            }
        }
    
        return curr;
        }

    // Helper method to print the elements of a linked list
private static void printList(ReverseLinkedList.ListNode head) {
    ReverseLinkedList.ListNode current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
    System.out.println();
}
}

