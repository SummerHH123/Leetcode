package _1_Array._2021百度;

import java.util.Scanner;

public class Main3 {


    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       solve();

    }

    private static void solve() {
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[][][] dp=new long[n+1][m+1][m+1];
        long mo=1000000007;
        dp[0][0][0]=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                for (int k=0;k<=m;k++){
                    if (j+k>i || j==k) continue;
                    if (i!=j && k==0) continue;
                    dp[i][j][k]=dp[i-j][k][0];
                    for (int l=1;l<=m;l++){
                        if (l!=j && j!=k && l!=k){
                            dp[i][j][k]=(dp[i][j][k]+dp[i-j][k][l])%mo;
                        }
                    }
                }
            }
        }
        long ans=0;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                ans=(ans+dp[n][i][j])%mo;
            }
        }
        System.out.println(ans);
    }

}
