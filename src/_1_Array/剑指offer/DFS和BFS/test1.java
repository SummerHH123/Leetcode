package _1_Array.剑指offer.DFS和BFS;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test1 {
    private int tes;
    static int function3(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return function3(x, n/2) * function3(x, n/2)*x;
        }else {
            return function3(x, n/2) * function3(x, n/2);
        }

    }

    public static void main(String[] args) {
//        System.out.println(function3(2, 5));

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=String.valueOf(n);
//        String s1 = s.replaceAll("", "-");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            sb.append("-");
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());


    }

}
