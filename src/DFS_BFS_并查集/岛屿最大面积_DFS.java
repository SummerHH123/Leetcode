package DFS_BFS_并查集;

public class 岛屿最大面积_DFS {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid == null) {
            return 0;
        }

        int[][] isMarked = new int[n][m];
        int countMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isMarked[i][j] == 0 && grid[i][j] == 1) {
                    countMax = Math.max(countMax, dfs(grid, i, j, isMarked));

                }
            }
        }
        return countMax;
    }

    static int[] x = {0, 0, 1, -1};
    static int[] y = {1, -1, 0, 0};

    public int dfs(int[][] grid, int xx, int yy, int[][] isMarked) {
        if (isMarked[xx][yy] == 1 && grid[xx][yy] == 1) {
            return 0;
        }
        isMarked[xx][yy] = 1;
        int temp = 1;
        for (int i = 0; i < 4; i++) {
            int nx = xx + x[i];
            int ny = yy + y[i];

            if (inArea(nx, ny, grid) && isMarked[nx][ny] != 1 && grid[nx][ny] == 1) {
                temp += dfs(grid, nx, ny, isMarked);
            }


        }

        return temp;
    }

    private boolean inArea(int x, int y, int[][] grids) {
        // 等于号不要忘了
        int rows = grids.length;
        int cols = grids[0].length;
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
