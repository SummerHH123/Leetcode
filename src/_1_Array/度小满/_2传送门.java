package _1_Array.度小满;

import java.util.Scanner;

public class _2传送门 {
    static int N,A,B,C;
    static int[] vis=new int[10005];
    static int[] a=new int[10005];
    static int ans=Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        for (int i=1;i<=N;i++){
            a[i]=sc.nextInt();
        }
        dfs(1,0);
        System.out.println(ans);
    }

    private static void dfs(int x, int s) {
        if (x==N){
            ans=Math.min(ans,s);
            return;
        }
        if (vis[a[x]]==0){
            vis[a[x]]=1;
            dfs(a[x],s+A);
            vis[a[x]]=0;
        }
        if (a[x]>1){
            if (vis[a[x]-1]==0){
                vis[a[x]-1]=1;
                dfs(a[x]-1,s+A+B);
                vis[a[x]-1]=0;
            }
        }

        if (a[x]<N){
            if (vis[a[x]+1]==0){
                vis[a[x]+1]=1;
                dfs(a[x]+1,s+A+C);
                vis[a[x]+1]=0;
            }
        }


    }

}
