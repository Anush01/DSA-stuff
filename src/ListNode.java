public class ListNode {

    Integer value;
    ListNode next;

    public ListNode(Integer value) {
        this.value = value;
    }

    public void insertNode(ListNode node) {
        if (next == null) {
            next = node;
        } else {

            ListNode lastNode = this.next;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = node;

        }
    }

}
