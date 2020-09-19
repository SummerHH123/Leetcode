package _1_Array._2021中兴;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-14 11:24
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


        int max=0;

        for (int i=0;i<n;i++){
            max=Math.max(max,a[i]);
        }
        if (a[a.length-1]==max){
            int count_nomax=0;
            for (int i=0;i<n;i++){
                if (a[i]!=max){
                    count_nomax++;
                }
            }
            int ans1=max*a.length;
            System.out.printf("%d %d",ans1,count_nomax);
        }






    }
}
