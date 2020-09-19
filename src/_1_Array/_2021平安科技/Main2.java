package _1_Array._2021平安科技;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-18 20:22
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(niu(n));

    }
    public static int  niu(int n){
        int[] dp=new int[n];
        if (n==0){
            return 1;
        }else if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else if (n==3){
            return 3;
        }else {
            dp[0]=1;
            dp[1]=2;
            dp[2]=3;
            for (int i=3;i<n;i++){
                dp[i]=dp[i-1]+dp[i-3];
            }
            return dp[n-1];
        }


    }
}
