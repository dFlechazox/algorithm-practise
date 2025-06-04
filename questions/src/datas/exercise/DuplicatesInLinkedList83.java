package datas.exercise;

public class DuplicatesInLinkedList83 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode prev = head;
        while (prev != null){
            ListNode cur = prev.next;
            while (cur != null){
                if (cur.val == prev.val){
                    prev.next = cur.next;
                }
                cur = cur.next;
            }
            prev = prev.next;
        }
        return head;
    }

    public ListNode deleteDuplicates1(ListNode head){                   //对上面方法的优化，由于是排好序的链表，所以可以一次遍历
        ListNode cur = head;
        while (cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }
}
