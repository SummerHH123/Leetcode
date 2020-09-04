package _1_Array.度小满;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        int ans=(n-a+1)*(m-b+1)*9;
//        System.out.println(ans);

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(-1);
        set.add(2);
        System.out.println(set.remove(-1));
    }
}
