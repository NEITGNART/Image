package com.company;

import java.io.IOException;

class ListNode<T extends Number> {

    T val;
    ListNode next;

    public ListNode() {

    }

    public ListNode(T val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(T val) {
        this.val = val;
    }

    static void traversal(ListNode head) throws IOException {

        ListNode tmp = head;

        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }

    }

    static ListNode addList(ListNode head, int val) {

        if (head == null) {
            return new ListNode(val);
        }

        ListNode tmp = head;

        while (tmp.next != null) tmp = tmp.next;

        tmp.next = new ListNode(val);

        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        int countNode = 0;

        return null;
    }

}



public class Main {

    public static void main(String[] args) {

        ListNode head = null;

        for (int i = 0; i < 10; i++) head = ListNode.addList(head, i);
        try {
            ListNode.traversal(head);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


//    public Node reveseGrps(Node head, int k) {
//        int x = k;
//        Node head_next = null;
//        Node h = head;
//        Node head_prev = null;
//        while (h != null && x-- > 0) {
//            head_next = h.next;
//            h.next = head_prev;
//            head_prev = h;
//            h = head_next;
//        }
//        if (head_next != null) {
//            head.next = reveseGrps(head_next, k);
//        }
//        return head_prev;
//
//    }
}


