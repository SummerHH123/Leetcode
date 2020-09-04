package _1_Array._2021爱奇艺;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('?','?');

        if (s.length()>0 && !map.containsKey(s.charAt(0))){
            System.out.println("False");
            return;
        }
        Stack<Character> stack=new Stack<>();
        stack.add('?');

        for (Character c:s.toCharArray()){
            if (map.containsKey(c)) stack.push(c);
            else if (map.get(stack.pop())!=c) {
                System.out.println("False");
                return;
            }
        }
        if (stack.size()==1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
