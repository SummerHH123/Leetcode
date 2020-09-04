package _1_Array.Leetcode;

import java.util.Map;

public class _121股票1 {

    public static void main(String[] args) {
        int[] a=new int[]{7,6,4,3,1};
        System.out.println(new _121股票1().maxProfit(a));


    }

    public int maxProfit(int[] prices) {

        int len=prices.length;
        if (len<=0){
            return 0;
        }
        int[][] dp=new int[len][3];
        dp[0][0]=0;
        dp[0][2]=0;
        dp[0][1]=-prices[0];

        for (int i=1;i<len;i++){
            dp[i][0]=0;
            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
        }
        return Math.max(dp[len-1][0],dp[len-1][2]);
    }
}
