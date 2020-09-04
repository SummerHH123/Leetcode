package _1_Array.剑指offer;

import java.util.ArrayList;
import java.util.Stack;

public class _3con尾到头打印链表 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        Stack<Integer> stack=new Stack<>();
//        while (listNode!=null){
//            stack.add(listNode.val);
//            listNode=listNode.next;
//        }
//        while (!stack.isEmpty()){
//            arrayList.add(stack.pop());
//        }
//        return arrayList;


        ArrayList<Integer> list=new ArrayList<>();
        if (listNode==null){
            return list;
        }
        return solve(list,listNode);

    }

    private static ArrayList<Integer> solve(ArrayList<Integer> list, ListNode listNode) {
        if (listNode.next!=null){//当前节点的下一个节点不为空
            list=solve(list,listNode.next);//往下递归
        }
        list.add(listNode.val);
        return list;
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode move=head;
        for (int i=0;i<10;i++){
            ListNode x=new ListNode(i);
            move.next=x;
            move=x;
        }
        ArrayList<Integer> arrayList = printListFromTailToHead(head);

        System.out.println(arrayList);



    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
