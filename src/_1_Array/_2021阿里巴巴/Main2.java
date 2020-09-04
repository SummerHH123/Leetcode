package _1_Array._2021阿里巴巴;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    private static int[] f=new int[100100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[m][3];
            int[] size=new int[n+2];

            for (int i=0;i<n;i++){
                f[i]=i;
                size[i]=1;
            }
            for (int i=0;i<m;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
                a[i][2]=sc.nextInt();
            }

            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[2]-o1[1];
                }
            });
            int Q=sc.nextInt();
            int[][] que=new int[Q+1][2];
            for (int i=0;i<Q;i++){
                que[i][0]=sc.nextInt();
                que[i][1]=i;
            }

            Arrays.sort(que, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[0]-o1[0];
                }
            });
            int now=0;
            long[] ans=new long[Q+1];
            long sum=0;
            for (int i=0;i<Q;i++){
                while (now<m && a[now][2]>=que[i][0]){
                    int  fa1=findx(a[now][0]);
                    int fa2=findx(a[now][1]);
                    if (fa1!=fa2){
                        sum+=size[fa1]*size[fa2]*2;
                        f[fa1]=fa2;
                        size[fa2]+=size[fa1];
                    }
                    now++;
                }
                ans[que[i][1]]=sum;
            }
            for (int i=0;i<Q;i++){
                System.out.println(ans[i]);
            }

        }

    }
    public static int findx(int x){
        if(f[x]==x)  return x;
        return f[x]=findx(f[x]);
    }
}
