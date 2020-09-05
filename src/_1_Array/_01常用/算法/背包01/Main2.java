package _1_Array._01常用.算法.背包01;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int capacity = sc.nextInt();


        int[] weight = new int[number + 1];
        int[] value = new int[number + 1];
        weight[0] = 0;
        value[0] = 0;

        for (int i = 1; i <= number; i++) {
            weight[i] = sc.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            value[i] = sc.nextInt();
        }

        int[] dp = new int[capacity + 1];

        for (int i = 0; i <= number; i++) {
            for (int j = capacity; j >= 0; j--) {
                if (i == 0) {
                    dp[j] = 0;
                } else if (j == 0) {
                    dp[j] = 0;
                } else {
                    if (j < weight[i]) {
                        dp[j] = dp[j];
                    } else if (j >= weight[i]) {
                        dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                    }
                }
                }

            }
        System.out.println(dp[capacity]);

    }
}
