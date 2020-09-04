package _1_Array._2021美团;

import java.util.Scanner;

public class Main3 {


    static class cc{
        int pos=0,lc,rc,lw,rw,f;
        public cc(int pos){
            this.pos=pos;
            this.lc=this.rc=0;
            this.f=0;
        }

    }
    private static int[] sum=new int[50005];
    private static int[] w=new int[50005];
    private static cc[] t=new cc[50005];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum[0]=0;
        for (int i=1;i<=n;i++){
            w[i]=sc.nextInt();
            sum[i]=sum[i-1]+w[i];
        }
        int now=0;
        t[0]=new cc(0);
        t[0].rw=sum[n];
        for (int i=1;i<=n;i++){
            int x=sc.nextInt();
            int f=0;
            while (true){
                if (t[f].pos>x){
                    if (t[f].lc!=0){
                        f=t[f].lc;
                    }else {
                        break;
                    }
                }else {
                    if (t[f].rc!=0){
                        f=t[f].rc;
                    }else {
                        break;
                    }
                }
            }

            t[++now]=new cc(x);
            t[now].f=f;
            if (t[f].pos>x){
                t[f].lc=now;
                t[now].rw=sum[t[f].pos]-w[t[f].pos]-sum[x];
                t[now].lw=t[f].lw-t[now].rw-w[x];
            }else {
                t[f].rc=now;
                t[now].lw=sum[x]-w[x]-sum[t[f].pos];
                t[now].rw=t[f].rw-t[now].lw-w[x];
            }
            int tmp=now;

            while (tmp!=0){
                int ff=t[tmp].f;
                if(t[ff].pos>t[tmp].pos){
                    t[ff].lw=Math.max(t[tmp].rw,t[tmp].lw);
                }else {
                    t[ff].rw=Math.max(t[tmp].rw,t[tmp].lw);
                }
                tmp=ff;
            }
            System.out.println(t[0].rw);
        }

    }
}
