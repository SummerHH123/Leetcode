package _1_Array.剑指offer.DFS和BFS;
import java.util.*;

/**
 * 200 岛屿数量
 */
public class 并查集1 {

    class UF{

        private int[] parent;

        public UF(int n){

            parent = new int[n];
            for(int i = 0 ; i < n ; i ++)
                parent[i] = i;
        }

        public int find(int p){
            if( p != parent[p] )
                parent[p] = find( parent[p] );
            return parent[p];
        }

        public boolean isConnected(int p , int q){
            return find(p) == find(q);
        }

        public void unionElements(int p, int q){

            int pRoot = find(p);
            int qRoot = find(q);

            if( pRoot == qRoot )
                return;

            parent[pRoot] = qRoot;
        }
    }

    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return 0;
            }

            int n = grid.length, m = grid[0].length;
            UF uf = new UF(n * m);
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        if (i > 0 && grid[i - 1][j] == '1') {
                            uf.unionElements(i * m + j, (i - 1) * m + j);
                        }
                        if (i <  n - 1 && grid[i + 1][j] == '1') {
                            uf.unionElements(i * m + j, (i + 1) * m + j);
                        }
                        if (j > 0 && grid[i][j - 1] == '1') {
                            uf.unionElements(i * m + j, i * m + j - 1);
                        }
                        if (j < m - 1 && grid[i][j + 1] == '1') {
                            uf.unionElements(i * m + j, i * m + j + 1);
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        set.add(uf.find(i * m + j));
                    }
                }
            }

            return set.size();
        }
    }
}
