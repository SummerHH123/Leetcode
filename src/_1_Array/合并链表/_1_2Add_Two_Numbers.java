package _1_Array.合并链表;

public class _1_2Add_Two_Numbers {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        LinkedList l2 = new LinkedList(6);
        LinkedList l3 = new LinkedList(7);

        l1.next = l2;
        l2.next = l3;

        LinkedList l4 = new LinkedList(4);
        LinkedList l5 = new LinkedList(5);
        LinkedList l6=new LinkedList(8);
        l4.next=l5;
        l5.next=l6;

        LinkedList head=mergeList(l1,l4);
        while (head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }


    public static LinkedList mergeList(LinkedList l1,LinkedList l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }

        LinkedList head=null;
        if (l1.value>=l2.value){
            head=l2;
            head.next=mergeList(l1,l2.next);
        }
        if (l2.value>l1.value){
            head=l1;
            head.next=mergeList(l1.next,l2);
        }

        return head;
    }
}

class LinkedList{
    LinkedList next;
    int value;
    public LinkedList(int value){
        this.value=value;

    }
}
