package Linklist;

public class Swap {
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur.next.next;
            cur.next.next = temp;
            cur = temp;
        }
        return dummy.next;
    }
}
