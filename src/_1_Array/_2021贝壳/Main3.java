package _1_Array._2021贝壳;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-07 15:19
 */
public class Main3 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0){
            solve();
        }

    }

    private static void solve() {

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        int[][] c=new int[m+1][m+1];

        for (int i=1;i<=m;i++){
            for (int j=1;j<=k;j++){
                int x=sc.nextInt();
                c[i][x]=1;
            }
        }
        long[][] dp=new long[n+1][m+1];

        for (int i=1;i<=m;i++){
            dp[1][i]=1;
        }

        for (int i=2;i<=n;i++){
            for (int j=1;j<=m;j++){
                for (int kk=1;kk<=m;kk++){
                    if (c[kk][j]==0){
                        dp[i][j]=(dp[i][j]+dp[i-1][kk])%1000000007;
                    }
                }
            }
        }
        long ans=0;
        for (int i=1;i<=m;i++){
            ans=(ans+dp[n][i])%1000000007;
        }
        System.out.println(ans);
    }
}
