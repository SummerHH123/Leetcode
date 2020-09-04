package _1_Array.bilbili2021;

import java.util.LinkedList;
import java.util.Stack;

public class Main1 {
    public boolean IsValidExp (String s) {
        // write code here
        LinkedList<Character> stack=new LinkedList<>();

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='{' || c=='[' || c=='('){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char ch=stack.pop();
                if(c==']' && ch!='['){
                    return false;
                }

                if(c=='}' && ch!='{'){
                    return false;
                }

                if(c==')' && ch!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
