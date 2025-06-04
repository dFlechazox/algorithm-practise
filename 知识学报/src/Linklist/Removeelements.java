package Linklist;
/*
 * 方法一
 * 在原链表中操作
 * 时间复杂度 O(n)
 * 空间复杂度 O(1)
 */
public class Removeelements {
    public ListNode removeElemeents1(ListNode head, int target){
        while (head != null && head.val == target){
            return head.next;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.next.val == target){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }

/*
* 方法二
* 设置一个虚拟头节点
* 时间 O(n)  空间O(1)
 */
    public ListNode removeElemeents2(ListNode head, int target){
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null){
            if (cur.next.val == target){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return dummy.next;              //head可能已经被删除了
    }
}
