package com.leetCode;

import java.util.ArrayList;

public class LinkedList {
    public ListNode middleNode(ListNode head) {

        ArrayList<ListNode> node = new ArrayList<>();
        node.add(head);
        while (head.next != null) {
            head = head.next;
            node.add(head);
        }
        boolean isOdd = node.size() / 2 == 0;
        int start = 0;
        if (isOdd) {
            start = (node.size() + 1) / 2;
        } else {
            start = (node.size() / 2) + 1;
        }
        return node.get(start - 1);
        // 위공식 시간 O(n) / 공간복잡도 O(n)
        // 아래는 최적화 코드 공간복잡도가 O(1)로 줄음
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
    }


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
