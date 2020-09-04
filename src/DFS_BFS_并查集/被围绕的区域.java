package DFS_BFS_并查集;
import java.util.*;
public class 被围绕的区域 {

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
            return;
        }

        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    if (board[i][j] != 'O') {
                        continue;
                    }

                    bfs(board, visited, i, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if (board[i][j] == 'W') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void bfs(char[][] board, boolean[][] visited, int i, int j) {
        int m = board.length, n = board[0].length;
        int[] bx = {-1, 0, 1, 0};
        int[] by = {0, -1, 0, 1};

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            board[x][y] = 'W';

            for (int k = 0; k < 4; k++) {
                int nextx = x + bx[k];
                int nexty = y + by[k];

                if (isValid(nextx, nexty, m, n) && !visited[nextx][nexty] && board[nextx][nexty] == 'O') {
                    queue.add(new Point(nextx, nexty));
                    visited[nextx][nexty] = true;
                }
            }
        }
    }

    private boolean isValid(int nextx, int nexty, int m, int n) {
        return nextx >= 0 && nextx < m && nexty >= 0 && nexty < n;
    }


}
