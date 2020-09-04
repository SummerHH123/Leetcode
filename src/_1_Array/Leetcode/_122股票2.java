package _1_Array.Leetcode;

import java.util.Map;

public class _122股票2 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
//        System.out.println(new _122股票2().maxProfit(a));
        System.out.println(new _122股票2().maxProfit(a));


    }
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if (len<2){
            return 0;
        }
        int[][] dp=new int[len][3];

        dp[0][0]=0;
        dp[0][1]=-prices[0];
        dp[0][2]=0;

        for (int i=1;i<len;i++){
            dp[i][0]= 0;
            dp[i][1]=Math.max(dp[i-1][0]-prices[i],Math.max(dp[i-1][2]-prices[i],dp[i-1][1]));
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
        }
        return Math.max(dp[len-1][0],dp[len-1][2]);

    }



//        private int res;
//
//        public int maxProfit(int[] prices) {
//            int len = prices.length;
//            if (len < 2) {
//                return 0;
//            }
//            this.res = 0;
//            dfs(prices, 0, len, 0, res);
//            return this.res;
//        }
//
//
//        /**
//         * @param prices 股价数组
//         * @param index  当前是第几天，从 0 开始
//         * @param status 0 表示不持有股票，1表示持有股票，
//         * @param profit 当前收益
//         */
//        public void dfs(int[] prices, int index, int len, int status, int profit) {
//
//            if (index == len) {
//                this.res = Math.max(this.res, profit);
//                return;
//            }
//
//            for (int i=0;i<2;i++){
//                if (i==0 && status==0){
//                    dfs(prices, index + 1, len, 0, profit);
//                }
//                else if (i==1 && status==0){
//                    dfs(prices, index + 1, len, 1, profit- prices[index]);
//
//                }else if (i == 0 && status==1) {
//                    // 可以尝试转向 1
//                    dfs(prices, index + 1, len, 1, profit);
//
//                } else if (i==1 && status==1){
//                    // 此时 status == 1，可以尝试转向 0
//                    dfs(prices, index + 1, len, 0, profit + prices[index]);
//                }
//            }
//
//
//        }



}
