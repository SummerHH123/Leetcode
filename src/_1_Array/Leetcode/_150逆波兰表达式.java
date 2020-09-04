package _1_Array.Leetcode;

import java.util.Stack;

public class _150逆波兰表达式 {
    public static int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<String> st=new Stack<>();

        for (int i=0;i<n;i++){
            String s=tokens[i];
            int result=0;
            if (s.equals("+")){
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                result=a+b;
                st.push(Integer.toString(result));
            }
            else if (s.equals("-")){
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                result=b-a;
                st.push(Integer.toString(result));
            }

            else if (s.equals("*")){
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                result=a*b;
                st.push(Integer.toString(result));
            }
            else if (s.equals("/")){
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                result=b/a;
                st.push(Integer.toString(result));
            }else {
                st.push(tokens[i]);
            }



        }
        return Integer.valueOf(st.pop());
    }

    public static void main(String[] args) {
        String[] s=new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(s));
    }
}
