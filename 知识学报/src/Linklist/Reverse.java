package Linklist;

public class Reverse {
    public ListNode reverse1(ListNode head){                //双指针
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverse2(ListNode head){                //递归
        return reverse(head, null);
    }

    public ListNode reverse(ListNode cur, ListNode pre){
        ListNode temp = new ListNode();
        if (cur == null){
            return pre;
        }
        temp = cur.next;
        cur.next = pre;
        return reverse(temp, cur);
    }
}
