package datas.exercise;

public class ReverseLinkedList203 {
    /*public ListNode reverseList(ListNode head){              试图把原链表中的元素取到数组中然后逆置形成新链表，傻逼。形成新链表时可以使用头/尾插法，但这绝对是一坨的方法
        int i = 0;
        int[] nums = new int[Integer.MAX_VALUE];
        while (head != null){
            nums[i] = head.val;
            head = head.next;
            i++;
        }
        ListNode cur = new ListNode(nums[i]);
        ListNode ahead = cur;
        for (int j = i; j >= 0; j--){
            cur.val = nums[i];
            cur = cur.next;
        }
        return ahead;
    }*/

    public ListNode reverseList(ListNode head){                   //双指针迭代
        ListNode cur = head;
        ListNode prev = null;
        if (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public ListNode reverseList1(ListNode head){                  //递归，有点难理解
        if (head == null || head.next == null){
            return head;
        }
        ListNode cur = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
