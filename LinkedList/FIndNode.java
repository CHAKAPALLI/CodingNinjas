public class FIndNode {
    public static int findNode(LinkedListNode<Integer> head, int n) {
        int position = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            if (temp.data == n) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }
}