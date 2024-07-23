import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        for(int i = 2; i<=10; i++){
            head.insertNode(new ListNode(i));
        }

        ListNode lastNodeUnreversed = head;
        while (lastNodeUnreversed != null){
            System.out.println(lastNodeUnreversed.value);
            lastNodeUnreversed = lastNodeUnreversed.next;
        }

        System.out.println("-----------");

        ListNode headOfNewReversedLinkedList = reverseLinkedList(head);

        ListNode lastNode = headOfNewReversedLinkedList;
        while (lastNode != null){
            System.out.println(lastNode.value);
            lastNode = lastNode.next;
        }

    }


    public static ListNode reverseLinkedList(ListNode head){

        ListNode newHead = null;

        ListNode currentNode = head;


        while (currentNode!=null){
            ListNode nextNode = currentNode.next;
            currentNode.next = newHead;
            newHead = currentNode;
            currentNode = nextNode;
        }


        head = newHead;
        return head;


    }

}
