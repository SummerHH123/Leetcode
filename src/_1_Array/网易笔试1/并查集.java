package _1_Array.网易笔试1;

import java.util.Scanner;

public class 并查集 {
    public static int fa[]=new int[100005];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int id=sc.nextInt();

        int k;
        for (int i=0;i<=n;i++){
            fa[i]=i;
        }

        for (int j=0;j<m;j++){
            k=sc.nextInt();

            int x;
            x=sc.nextInt();
            for (int i=0;i<k-1;i++){
                int y;
                y=sc.nextInt();
                Union(x,y);
            }
        }
        int ans=0;
        for (int i=0;i<n;i++){
            if (find(i)==find(id)){
                ans++;
            }
        }
        System.out.println(ans);

    }

    private static void Union(int x, int y) {

        int xx=find(x);
        int yy=find(y);
        if (xx==yy){
            return;
        }
        fa[xx]=yy;
    }

    private static int find(int x) {

        while (x!=fa[x]){
            x=fa[x];
    }
        return x;

    }

}
