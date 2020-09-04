package _1_Array.剑指offer.网易2020;

//最大矩阵思路：
//        O(M*N)
import java.util.*;
public class 放置货物1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfCase = in.nextInt();

        for (int a = 0; a < numOfCase;  a++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] grid = new int[n][m];
            for (int i = 0 ; i < n; i++) {
                Arrays.fill(grid[i],1);
            }
            for (int i = 0; i < k; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                grid[x-1][y-1] = 0;
            }
            int c = in.nextInt();
            int d = in.nextInt();

            int[] height = new int[m];
            int[] left = new int[m];
            int[] right = new int[m];

            Arrays.fill(right, m);

            boolean found = false;

            int area=0;

            for (int i = 0; i < n; i++) {
                int curLeft = 0, curRight = m;
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) height[j]++;
                    else height[j] = 0;
                }
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) left[j] = Math.max(left[j],curLeft);
                    else {left[j] = 0; curLeft = j+1;}
                }
                for (int j = m-1; j >= 0; j--) {
                    if (grid[i][j] == 1) right[j] = Math.min(right[j],curRight);
                    else {right[j] = m; curRight = j;}
                }
                for (int j = 0; j < m; j++) {
                    int cc = right[j] - left[j], dd = height[j];
                    if (cc*dd >= c*d &&(cc >= c && dd >= d )
                            || (cc >= d && dd >= c) ) {
                        found = true;

                    }


                }
                if (found) {
                    System.out.println("YES");
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
            }

        }

    }
}

