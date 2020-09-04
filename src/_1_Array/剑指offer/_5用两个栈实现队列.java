package _1_Array.剑指offer;

import java.util.Stack;

public class _5用两个栈实现队列 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        if (stack2.isEmpty()){
            stack1.push(node);
        }else {
           while (stack2.size()!=0){
               stack1.push(stack2.pop());
           }
           stack1.push(node);
        }
    }

    public int pop() {
       while (stack1.size()!=0){
           stack2.push(stack1.pop());
       }
       return stack2.pop();

    }

    public static void main(String[] args) {
        _5用两个栈实现队列 te=new _5用两个栈实现队列();
        te.push(1);
        te.push(2);
        System.out.println(te.pop());
    }
}
