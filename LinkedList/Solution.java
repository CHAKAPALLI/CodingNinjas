public class Solution {
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> temp = head, checkNode = null, newHead = null;

        if (n == 0) {
            return head;
        }
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < n) {
            return head;
        }
        n = count - n;
        // break and make new head
        temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        checkNode = temp.next;
        temp.next = null;
        newHead = checkNode;

        while (checkNode.next != null) {
            checkNode = checkNode.next;
        }
        checkNode.next = head;
        head = newHead;
        return head;
    }
}