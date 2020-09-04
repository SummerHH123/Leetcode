package _1_Array.剑指offer.网易2020;

import java.util.Arrays;
        import java.util.Scanner;

public class 小易英语软件 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }



        int m=sc.nextInt();


        while(m-->0){
            int number=sc.nextInt()-1;
            int target=a[number];
            int count=0;
            for (int i=0;i<a.length;i++){
                if (a[i]<=target){
                    count++;
                }
            }
            double ans=(double) (count-1)/a.length*100;
            String format = String.format("%.6f", ans);
            System.out.println(format);
        }
    }
}
