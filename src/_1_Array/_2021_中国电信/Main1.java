package _1_Array._2021_中国电信;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 20:16
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp=new int[n];
        dp[0]=1;

        for (int i=1;i<n;i++){
            int u2=dp[a]*2;
            int u3=dp[b]*3;
            int u5=dp[c]*5;
            dp[i]=Math.min(Math.min(u2,u3),u5);
            if (dp[i]==u2){
                a++;
            }
            if (dp[i]==u3){
                b++;
            }
            if (dp[i]==u5){
                c++;
            }
        }
        System.out.println(dp[n-1]);

    }
}
