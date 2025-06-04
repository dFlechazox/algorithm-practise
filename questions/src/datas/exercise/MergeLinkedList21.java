package datas.exercise;

public class MergeLinkedList21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){                             //递归
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2){                //指针迭代
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                prev.next = list1;
                list1 = list1.next;
            }
            else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 == null){
            prev.next = list2;
        }
        if (list2 == null){
            prev.next = list1;
        }
        //prev.next = list1 == null ? list1:list2;
        return prehead.next;
    }
}
