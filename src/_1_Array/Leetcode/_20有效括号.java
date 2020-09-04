package _1_Array.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20有效括号 {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack=new Stack<>();

        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else {
                char c=stack.isEmpty()?'*':stack.pop();
                if (map.getOrDefault(c,c)!=s.charAt(i)){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s="";
        System.out.println(new _20有效括号().isValid(s));
    }
}
