package _1_Array;

import java.util.Scanner;

public class Main5 {
    public static int vis[]=new int[100005];//chus
    public static int vis1[]=new int[100005];//siw
    public static int cc[]=new int[100005];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int tmp;
        vis1[m+1]=2;
        for (int i=0;i<p;i++){
            tmp=sc.nextInt();
            vis[tmp]=1;
            vis1[tmp+m+1]=2;
        }
        int x=sc.nextInt();
        int sum=n;
        int top=0;
        int tail=0;
        cc[tail]=n;
        tail++;
        for (int i=1;i<=x;i++){
            if (vis[i]==1){
                cc[tail]=sum;
                tail++;
                sum+=sum;
            }
            if (vis1[i]==2){
                if (top>=tail){
                    continue;
                }else {
                    sum-=cc[top];
                    top++;
                }
            }
        }
        System.out.println(sum);

    }
}
