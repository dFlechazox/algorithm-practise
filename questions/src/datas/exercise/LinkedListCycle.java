package datas.exercise;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head){                          //快慢指针，如果快指针能赶上慢指针则说明存在环
        ListNode slow = head;
        ListNode fast = head.next;
        if (head == null || head.next == null){
            return false;
        }
        while (slow != fast){
            if (slow == null || fast == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
