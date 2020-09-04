package _1_Array.剑指offer;

import java.util.Stack;

public class _打印链表倒数第K个节点 {

    public static ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> st=new Stack<>();
        int cu=0;
        while (head!=null){
            st.push(head);
            head=head.next;
            cu++;
        }

        int count=1;
        if (k>cu||k==0){
            return null;
        }
        while (count!=k){
            st.pop();
            count++;
        }
        return st.pop();

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode move=head;
        for (int i=0;i<10;i++){
            ListNode x=new ListNode(i);
            move.next=x;
            move=x;
        }
        move=head;
        while (move!=null){
            System.out.printf("%d ",move.val);
            move=move.next;
        }
        ListNode target=FindKthToTail(head,3);
        System.out.println(target.val);

    }
}
