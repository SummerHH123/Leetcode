package _1_Array._2021_中国电信;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 21:19
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] split = s.split(",");
        int[] a=new int[split.length];

        for (int i=0;i<a.length;i++){
            a[i]=Integer.valueOf(split[i]);
        }

        int n=a.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=a[0];
        for (int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i-1]);

        }
        System.out.println(dp[n]);
    }
}
