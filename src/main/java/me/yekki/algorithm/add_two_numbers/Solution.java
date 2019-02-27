package me.yekki.algorithm.add_two_numbers;

/**
 * Definition for singly-linked list.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    void display() {
        ListNode n = this;

        while (n != null) {
            if (n.next != null)
                System.out.print(n.val + "->");
            else {
                System.out.println(n.val);
            }
            n = n.next;
        }
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode p = head;
        int quot = 0;

        while( l1 != null || l2 != null || quot != 0) {

            if (l1 != null) {
                quot += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                quot += l2.val;
                l2 = l2.next;
            }

            int rem = quot % 10;
            quot = Math.floorDiv(quot, 10);

            p.next = new ListNode(rem);
            p = p.next;

        }

        return head.next;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        Solution s = new Solution();
        ListNode ret = s.addTwoNumbers(l1, l2);
        ret.display();
        //System.out.println(7%10);
    }
}