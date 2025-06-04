package datas.exercise;

public class RemoveLinkedListEle203 {
    public ListNode removeElements(ListNode head, int val){                  //指针迭代
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode prev = prehead;
        while (head != null){
            if (head.val == val){
                prev.next = head.next;
            }
            else {
                prev = prev.next;
            }
            head = head.next;
        }
        return prehead.next;
    }

    public ListNode removeElements1(ListNode head, int val){                  //递归
        if (head == null){
            return head;
        }
        head.next = removeElements1(head.next, val);
        return head.val == val ? head : head.next;
    }
}
