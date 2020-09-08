package _1_Array._2021贝壳;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-07 15:51
 */
public class Test1 {
    public static int[] a1 = new int[1005];
    public static int[] a2 = new int[1005];
    public static int[] b1 = new int[1005];
    public static int[] b2 = new int[1005];
    public static int[] pa1 = new int[1005];
    public static int[] pa2 = new int[1005];
    public static int[] pb1 = new int[1005];
    public static int[] pb2 = new int[1005];

    public static int[][] dp = new int[1005][1005];

    public static int inf = 2000000001;

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for (int i = n; i >= 1; i--) a1[i] = S.nextInt();
        for (int i = 1; i <= n; i++) {
            a2[i] = S.nextInt();
            pa2[i] = pa2[i - 1] + a2[i];
        }
        for (int i = n; i >= 1; i--) b1[i] = S.nextInt();
        for (int i = 1; i <= n; i++) {
            b2[i] = S.nextInt();
            pb2[i] = pb2[i - 1] + b2[i];
        }

        for (int i = 1; i <= n; i++) {
            pa1[i] = pa1[i - 1] + a1[i];
            pb1[i] = pb1[i - 1] + b1[i];
        }

        for (int i = 0; i <= n; i++) for (int j = 0; j <= n; j++) dp[i][j] = inf;
        dp[0][0] = 0;

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++) {
                if (i >= 1) {
                    int res = dp[i - 1][j];
                    res -= pa1[i - 1];
                    res += pb1[i - 1];
                    res -= pa2[j];
                    res += pb2[j];
                    if (res >= a1[i]) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                    else dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + (a1[i] - res));
                }

                if (j >= 1) {
                    int res = dp[i][j - 1];
                    res -= pa1[i];
                    res += pb1[i];
                    res -= pa2[j - 1];
                    res += pb2[j - 1];
                    if (res >= a2[j]) dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
                    else dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + (a2[j] - res));
                }
            }
        System.out.println(dp[n][n] + 1);
    }
}
