package _1_Array._2021华为;

import java.util.Scanner;

public class Main3 {
    public static int[][] map_c=new int[1010][20];
    public static int[][] map_a=new int[1010][20];
    public static int[] a=new int[1010];
    public static int[] b=new int[1010];
    public static String s1,s2;
    public static int n,m;

    public static int calc(int x){
        int ma=0;
        for (int i=0;i<m;i++)
            ma=Math.max(ma,a[x+i]+b[i]);
        for (int i=0;i<1000;i++){
            for (int j=0;j<20;j++){
                map_c[i][j]=map_a[i][j];
            }
        }
        for (int i=0;i<m;i++)
            for (int j=0;j<b[i];j++)
                map_c[x+i][ma-j-1]=1;
        int ans=0;
        for (int j=0;j<19;j++){
            int k=0;
            for (int i=0;i<n;i++)
                if (map_c[i][j]==1) k++;
            if (k>0 && k<n) ans++;
        }
        return ans;

    }

    public static void calc_h(String s,int[] h){
        int n=s.length();
        for (int i=0;i<n;i++){
            h[i]=s.charAt(i)-'0';
        }
    }
    public static void change(String s,int[] h){
        int n=s.length();
        for (int i=0;i<n;i++){
            for (int j=0;j<h[i];j++){
                map_a[i][j]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        n=s1.length();
        m=s2.length();
        calc_h(s1,a);
        calc_h(s2,b);

        change(s1,a);
        int ans=20;
        for (int i=0;i<=n-m;i++){
            ans=Math.min(ans,calc(i));
        }
        System.out.println(ans);



    }
}
