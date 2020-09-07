package _1_Array._2021贝壳;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-07 15:51
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int[] b=new int[n+1];
        int[] va=new int[n+1];
        int[] vb=new int[n+1];
        for (int i=n;i>=1;i--){
            a[i]=sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            b[i]=sc.nextInt();
        }
        for (int i=n;i>=1;i--){
            va[i]=sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            vb[i]=sc.nextInt();
        }
        int[][] dp=new int[n+1][n+1];//左边第i个走到n  右边第j个走到n

        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                dp[i][j]=1000000000;
            }
        }

        dp[n][n]=1;
        for (int i=n;i>=0;i--){
            for (int j=n;j>=0;j--){
                if (i!=0){
                    dp[i-1][j]=Math.min(dp[i-1][j],Math.max(dp[i][j]-va[i],1)+a[i]);
                }
                if (j!=0){
                    dp[i][j-1]=Math.min(dp[i][j-1],Math.max(dp[i][j]-vb[j],1)+b[j]);
                }
            }
        }
        System.out.println(dp[0][0]);

    }
}
