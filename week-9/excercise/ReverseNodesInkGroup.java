public class ReverseNodesInkGroup {
    



    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(){};
        public ListNode(int val){
            this.val =val;
        }
        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }

    }





    public static void main(String[] args) {
        
        ListNode head1 = new ListNode(1,
            new ListNode(2,
                    new ListNode(3,
                            new ListNode(4,
                                    new ListNode(5)))));
    System.out.println("Original List:");
    printList(head1);
    head1 = reverseKGroup(head1,3);
    System.out.println("Reversed List:");
    printList(head1);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
    
       ListNode prevNode = dummyNode;
       ListNode currNode = head;
       ListNode currNext = head;
       ListNode prevTailNode = dummyNode;
       ListNode currHeadNode = head;
    
        int count = 0;
        while(currNode != null){
            count++;
            currNext = currNode.next; // hold next node
            if(count % k == 0){ // if group is formed reverse them 
            ListNode reversedHeadNode =  reverseLinkedList(currHeadNode,currNode); // reverse k group 
            prevTailNode.next = reversedHeadNode; //link reversed list head to the previous tail node
            currHeadNode.next = currNext; // link reversed k group tail node to next head node 
            prevTailNode = currHeadNode; // change previous tail node to current head node
            currHeadNode = currNext; // current head node to current next 
            }
            currNode = currNext;  //loop 
            }
    
        return dummyNode.next;    
        }
    
        
    
        /**
        * reverse linked list from head node to end node
        */
        public static ListNode reverseLinkedList(ListNode head,  ListNode end){
            ListNode prev = null;
            ListNode curr = head;
            ListNode currNext = head;
    
            while(true){    
                currNext = curr.next;
                curr.next = prev;
                prev = curr;
                if(prev == end){
                    break;
                }
                curr = currNext; 
            }
    
            return curr;
    
        }
    

    private static void printList(ReverseNodesInkGroup.ListNode head) {
    ReverseNodesInkGroup.ListNode current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
    System.out.println();
}
}
