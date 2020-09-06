package _1_Array._2021腾讯;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-06 20:18
 */
public class Main2 {

    static class unionFind {
        private int[] parent;
        private int[] rank;

        public unionFind(int size) {
            this.parent = new int[size];
            this.rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }


        public int find(int p) {
            int curP = p;
            while (parent[curP] != curP){
                curP = parent[curP];
            }

            parent[p] = curP;
            return curP;

        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {

            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) return;

            if (rank[pRoot] > rank[qRoot]) {
                parent[qRoot] = pRoot;
            } else if (rank[pRoot] < rank[qRoot]) {
                parent[pRoot] = qRoot;
            } else {
                parent[qRoot] = pRoot;
                rank[pRoot] += 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        unionFind uf = new unionFind(n);
        int m = sc.nextInt();



        while (m-- > 0) {
            int q = sc.nextInt();



            int a = sc.nextInt();
            if (a>=n){
                throw  new Exception("数组越界");
            }
            for (int i = 0; i < q - 1; i++) {
                int b = sc.nextInt();
                if (b>=n){
                    throw  new Exception("数组越界");
                }
                uf.union(a, b);
                a = b;
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (uf.isConnected(0, i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
