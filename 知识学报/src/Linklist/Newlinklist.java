package Linklist;

public class Newlinklist {
    class MyLinkedList {
        int size;
        ListNode Head;              //虚拟头节点
        public MyLinkedList(){
            size = 0;
            Head = new ListNode(0);
        }

        public int get(int index){
            ListNode cur = Head;
            if (index < 0 || index >= size){
                return -1;
            }
            for (int i = 0; i <= index ; i++){
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val){
            ListNode head = new ListNode(val);
            head.next = Head.next;
            Head.next = head;
            size++;
        }

        public void addAtTail(int val){
            ListNode cur = Head;
            ListNode tail = new ListNode(val);
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = tail;
            size++;
        }

        public void addAtIndex(int index, int val){
            ListNode cur = Head;
            ListNode insert = new ListNode(val);
            if (index < 0){
                index = 0;
            }
            if (index > size){
                return;
            }
            for (int i = 0; i < index; i++){
                cur = cur.next;
            }
            insert.next = cur.next;
            cur.next = insert;
            size++;
        }

        public void deleteAtIndex(int index){
            ListNode cur = Head;
            if (index < 0 || index >= size){
                return;
            }
            for (int i = 0; i < index; i++){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
        }
    }
}
