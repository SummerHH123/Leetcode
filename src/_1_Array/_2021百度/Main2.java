package _1_Array._2021百度;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int k = sc.nextInt();
                int[][] b = new int[k][2];
                for (int j = 0; j < k; j++) {
                    b[j][0] = sc.nextInt();
                    b[j][1] = sc.nextInt();
                }
                Arrays.sort(b, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[0] == o2[0]) {
                            return o1[1] - o2[1];
                        }
                        return o1[0] - o2[0];
                    }
                });
                int now = 0;
                for (int j = 0; j < k; j++) {
                    now = Math.max(now, b[j][0]);
                    while (now <= b[j][1]) {
                        a[now] += 1;
                        now += 1;
                    }
                }
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (a[i] == m) {
                    ans += 1;
                }
            }
            System.out.println(ans);
            for (int i = 1; i <= n; i++) {
                if (a[i] == m) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
