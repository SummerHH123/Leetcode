package _1_Array._2021东方财富;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins={20,10,5,2,1};

        System.out.println(counts(coins, n));

    }

    private static int counts(int[] coins, int n) {
        int[][] dp=new int[coins.length+1][n+1];
        for (int i=0;i<=coins.length;i++) {
            dp[i][0]=1;
        }
        for (int i=1;i<=coins.length;i++){
            for (int sum=1;sum<=n;sum++){
                for (int k=0;k<=sum/coins[i-1];k++){
                    dp[i][sum]+=dp[i-1][sum-k*coins[i-1]];
                }
            }
        }
        return dp[coins.length][n];
    }


}
