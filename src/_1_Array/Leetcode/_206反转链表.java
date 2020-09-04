package _1_Array.Leetcode;


import java.math.BigInteger;

public class _206反转链表 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre=null;
        ListNode cur=head;

        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;

            pre=cur;
            cur=temp;
        }
        return pre;



    }

    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("11111111111111111111111111111101",2));
        BigInteger bigInteger=new BigInteger("11111111111111111111111111111101",2);
        System.out.println(bigInteger.intValue());

    }


}
