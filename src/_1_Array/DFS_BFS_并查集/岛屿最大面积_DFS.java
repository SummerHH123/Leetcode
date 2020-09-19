package _1_Array.DFS_BFS_并查集;

public class 岛屿最大面积_DFS {
    public static int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid == null) {
            return 0;
        }

        int[][] isMarked = new int[n][m];
        int countMax1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isMarked[i][j] == 0 && grid[i][j] == 1) {
                    count=0;
                    countMax1 = Math.max(countMax1, count);

                }
            }
        }
        return countMax1;
    }

    static int[] x = {0, 0, 1, -1};
    static int[] y = {1, -1, 0, 0};

    public void dfs(int[][] grid, int xx, int yy, int[][] isMarked) {
        if (isMarked[xx][yy] == 1 && grid[xx][yy] == 1) {
            return;
        }
        isMarked[xx][yy] = 1;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = xx + x[i];
            int ny = yy + y[i];

            if (inArea(nx, ny, grid) && isMarked[nx][ny] != 1 && grid[nx][ny] == 1) {
               dfs(grid, nx, ny, isMarked);
            }


        }

    }

    private boolean inArea(int x, int y, int[][] grids) {
        // 等于号不要忘了
        int rows = grids.length;
        int cols = grids[0].length;
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
