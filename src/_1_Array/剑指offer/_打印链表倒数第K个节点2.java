package _1_Array.剑指offer;

public class _打印链表倒数第K个节点2 {


    private ListNode ans=null;
    private int sum=0;
    public  ListNode FindKthToTail(ListNode head,int k) {



       if (head==null){
           return null;
       }


        solve(head,k);
        return ans;
    }

    public  void solve(ListNode node,int k){
        if (node.next!=null){
            solve(node.next,k);
        }
        sum++;
        if (sum==k){
            ans=node;
        }

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



        ListNode target=new _打印链表倒数第K个节点2().FindKthToTail(head,3);
        System.out.println(target.val);
    }

}
