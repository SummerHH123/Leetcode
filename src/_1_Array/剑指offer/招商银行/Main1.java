package _1_Array.剑指offer.招商银行;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Character> map=new HashMap();
        map.put('1','1');
        map.put('2','5');
        map.put('3','8');
        map.put('4','7');
        map.put('6','9');


        map.put('5','2');
        map.put('8','3');
        map.put('7','4');
        map.put('9','6');

        int n=sc.nextInt();
        while (n-->0){
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s).reverse();

            StringBuilder ans1=new StringBuilder();

            StringBuilder ans2=new StringBuilder();

            for (int i=0;i<s.length();i++){
                ans1.append(map.get(s.charAt(i)));
            }
            String s1=sb.toString();
            for (int i=0;i<s1.length();i++){
                ans2.append(map.get(s1.charAt(i)));
            }


            if (ans1.toString().equals(s1) && ans2.toString().equals(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


        }
    }
}
