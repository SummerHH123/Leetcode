package _1_Array._01常用.算法;

import java.util.Scanner;

public class 并查集 {

    static class unionFind {
        private int[] parent;
        private int[] rank;// rank[i]表示以i为根节点的树的高度

        public unionFind(int size) {
            this.parent = new int[size];
            this.rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i; //  初始的时候每个元素都指向自己  可以用-1来表示一个集合
                rank[i] = 1;
            }
        }

        // 查询根节点
        public int find(int p) {
            int curP = p;
            while (parent[curP] != curP){ // 说明还没到达根节点
                curP = parent[curP];
            }

            parent[p] = curP; // 直接将查找的p节点的父节点更新为根节点
            return curP;

        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {
            //pq在一个根上
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) return;
            ///////
            //pq在不在同一个节点上


            // 这里合并的时候判断树的高度，将其高度低的节点指向高度高的根节点
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

//    static int[] a=new int[10005];
    // 方式三：并查集
//    public int findCircleNum(int[][] M) {
//        int peopleCount = M.length;
//
//        unionFind unionFind = new unionFind(peopleCount);
//        for (int i = 0; i < peopleCount; i++){
//            for (int j = 0; j <= i; j++){
//                if (i == j) continue;
//                if (M[i][j] == 1) unionFind.union(i, j);
//            }
//        }
//
//        int[] arr = unionFind.parent;
//        int count = 0;
//        for (int i = 0; i < peopleCount; i++){
//            if (arr[i] == -1){
//                count++;
//            }
//        }
//
//        return count;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        unionFind uf = new unionFind(n);
        int m = sc.nextInt();
        int id = sc.nextInt();


        while (m-- > 0) {
            int q = sc.nextInt();


            int a = sc.nextInt();
            for (int i = 0; i < q - 1; i++) {
                int b = sc.nextInt();//b[i]
                uf.union(a, b);
                a = b;
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (uf.isConnected(id, i)) {
                count++;
            }
        }

//        int[] a=uf.parent;
//        System.out.println(count);
//        for (int tmp:a){
//            System.out.printf("%d ",tmp);
//        }


    }

}
