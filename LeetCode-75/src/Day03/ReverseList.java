package Day03;

/**
 * 206. 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class ReverseList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
