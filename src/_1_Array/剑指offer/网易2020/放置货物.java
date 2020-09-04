package _1_Array.剑指offer.网易2020;


import java.util.Scanner;

public class 放置货物 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfCase = in.nextInt();

        while (numOfCase-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = 1;
                }
            }
            for (int i = 0; i < k; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                grid[x - 1][y - 1] = 0;
            }
            int c = in.nextInt();
            int d = in.nextInt();



            int row = grid.length;
            if (row == 0) {
                System.out.println("NO");
            }
            int column = grid[0].length;
            int[][] dp = new int[row][column];

            for(int i = 0; i < row; i++)
                for(int j = 0; j < column; j++)
                    if(grid[i][j] == 1)
                        dp[i][j] = 1;

            for (int i = 1; i < row; i++){
                for (int j = 0; j < column; j++) {
                    if (dp[i - 1][j] >= 1)
                        if (dp[i][j] == 1)
                            dp[i][j] = dp[i - 1][j] + 1;
                }
            }



            int area = 0;


            int width=0;
            int height=0;
            boolean flag=false;

            int min=0;
            int max=0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (dp[i][j] == 0) continue;

                    int curHeigth = dp[i][j];
                    for (int l = j; l >= 0 && dp[i][l] != 0; l--) {
                        int curWidth = j - l + 1;
                        curHeigth = Math.min(curHeigth, dp[i][l]);


                        area = Math.max(area, Math.max(dp[i][l], curHeigth * curWidth));

                        if (area>=c*d){

                        }

                    }

                }
            }
            System.out.println(area);
            System.out.println(width);
            System.out.println(height);

            if (area>=c*d && ((width>=c && height>=d) ||(width>=d && height>=c)) ){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }


    }
}
