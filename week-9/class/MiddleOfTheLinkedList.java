/*
 * 
 * Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

public class MiddleOfTheLinkedList {

    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(){};
        public ListNode(int data){
            this.data =data;
        }
        public ListNode(int data,ListNode next){
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
    
       ListNode head = new ListNode(1,null);
        
       ListNode first = new ListNode(2,null);

       ListNode second = new ListNode(3,null);
       
       ListNode third = new ListNode(4,null);
       
       ListNode four = new ListNode(5,null);

       ListNode five = new ListNode(6,null);

       
       head.next = first;
       first.next = second;
       second.next = third;
       third.next = four;
       four.next = five;

       //System.out.println(second.data);
        System.out.println(middleNode(head).data);
    }


    public static ListNode middleNode(ListNode head) {
    
    
        // using fast pointer and slow pointer approach 
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        
        while(fastPointer != null && fastPointer.next != null){
            
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
        }
    
        return slowPointer;
        
    }

    }

