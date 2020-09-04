package _1_Array.剑指offer.DFS和BFS;

import java.util.*;

/**
 * 岛屿数量
 */
public class 岛屿数量_BFS {

    /**
     * 方法二：广度优先遍历
     */


    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        //           x-1,y
        //  x,y-1    x,y      x,y+1
        //           x+1,y


        rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        cols = grid[0].length;
        boolean[][] marked = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 如果是岛屿中的一个点，并且没有被访问过
                // 从坐标为 (i,j) 的点开始进行广度优先遍历
                if (!marked[i][j] && grid[i][j] == '1') {
                    count++;
                    bfs(i,j,marked,grid);

                }
            }

        }
        return count;
    }

    private void bfs(int i, int j, boolean[][] marked, char[][] grid) {
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        LinkedList<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i,j});

        marked[i][j] = true;
        while (!queue.isEmpty()) {
            int size=queue.size();

            // 得到 4 个方向的坐标
            for (int n=0;n<size;n++){
                int[] ints = queue.poll();
                int curX = ints[0];
                int curY = ints[1];
                for (int k = 0; k < 4; k++) {
                    int newX = curX + directions[k][0];
                    int newY = curY + directions[k][1];
                    // 如果不越界、没有被访问过、并且还要是陆地，我就继续放入队列，放入队列的同时，要记得标记已经访问过
                    if (inArea(newX, newY) && grid[newX][newY] == '1' && !marked[newX][newY]) {
                        queue.offer(new int[]{newX,newY});
                        // 【特别注意】在放入队列以后，要马上标记成已经访问过，语义也是十分清楚的：反正只要进入了队列，你迟早都会遍历到它
                        // 而不是在出队列的时候再标记
                        // 【特别注意】如果是出队列的时候再标记，会造成很多重复的结点进入队列，造成重复的操作，这句话如果你没有写对地方，代码会严重超时的
                        marked[newX][newY] = true;
                    }
                }
            }

        }

    }

    private boolean inArea(int x, int y) {
        // 等于号这些细节不要忘了
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    public static void main(String[] args) {
        岛屿数量_BFS solution2 = new 岛屿数量_BFS();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int numIslands1 = solution2.numIslands(grid1);
        System.out.println(numIslands1);

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        int numIslands2 = solution2.numIslands(grid2);
        System.out.println(numIslands2);
    }


}
