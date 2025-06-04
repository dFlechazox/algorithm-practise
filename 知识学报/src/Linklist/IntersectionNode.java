package Linklist;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){        //实现长短链表同步移动
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }
        while (curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        if (lenB > lenA){
            int lentemp = lenA;
            lenA = lenB;
            lenB = lentemp;
            ListNode temp = curA;
            curA = curB;
            curB = temp;
        }
        int gap = lenA - lenB;
        while (gap-- > 0){
            curA = curA.next;
        }
        while (curA != curB){       //注意：交点判断的是指针相等，而不是数值相等！
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){       //合并链表实现同步移动
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2){
            if (p1 == null){
                p1 = headB;
            }
            else {
                p1 = p1.next;
            }
            if (p2 == null){
                p2 = headA;
            }
            else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
