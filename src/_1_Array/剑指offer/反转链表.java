package _1_Array.剑指offer;

import javax.sound.sampled.Line;

public class 反转链表 {

    public static Linked reverse(Linked head) {

        if (head == null || head.next == null) {
            return head;
        }


        Linked newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;


        return newHead;
    }

    public static void main(String[] args) {
        Linked head = new Linked(1);
        Linked second = new Linked(2);
        Linked third = new Linked(3);
        Linked fourth = new Linked(4);

        head.next=second;
        second.next=third;
        third.next=fourth;
        Linked temp=head;
        while (temp!=null){
            System.out.printf("%d ",temp.val);
            temp=temp.next;
        }
        System.out.println();

        Linked newHead=reverse(head);
        while (newHead!=null){
            System.out.printf("%d ",newHead.val);
            newHead=newHead.next;
        }
    }
}

class Linked {
    int val;
    Linked next;

    public Linked(int val) {
        this.val = val;
    }
}
