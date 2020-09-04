package _1_Array.Leetcode;

public class _148排序链表 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 递归结束条件
        if (head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        // 快慢指针找到中间节点
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        // 把链表从中间断开
        ListNode tail = p1;
        p1 = p1.next;
        tail.next = null;

        // 左边排序后返回左链表的开头
        ListNode L = sortList(head);
        // 右边排序后返回右链表的开头
        ListNode R = sortList(p1);
        return merge(L, R);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;

        // 比较左右链表
        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                cur = cur.next;
                left = left.next;
            } else {
                cur.next = right;
                cur = cur.next;
                right = right.next;
            }
        }
        if (left != null) {
            cur.next = left;
        }
        if (right != null) {
            cur.next = right;
        }

        return pre.next;
    }


}
