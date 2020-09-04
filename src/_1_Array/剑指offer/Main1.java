package _1_Array.剑指offer;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int x=sc.nextInt();
            int rever_count=0;
            String s=String.valueOf(x);
            int len=s.length();
            LinkedList<Character> queue=new LinkedList<>();
//            for (int i=0;i<len;i++){
//                li.add(s.charAt(i));
//            }
            queue.offer(s.charAt(0));
            while (!queue.isEmpty()){
                char num=queue.poll();
//                for ()
                if (num=='1'){
                    num='0';
                    queue.offer(num);
                }

            }

        }
    }



}
