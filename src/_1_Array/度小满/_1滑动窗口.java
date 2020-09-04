package _1_Array.度小满;

import java.util.Arrays;
import java.util.Scanner;

public class _1滑动窗口 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int count=1;
        int[][] ma=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                ma[i][j]=count++;
            }
        }


        int result=0;

        int countx=0;
        int county=0;
       while (b<m && a<n){
            int max=0;

            a+=countx;
            b+=county;
            result+=dfs(ma,a,b,0,0,max);
            countx+=a;
            county+=b;
        }



    }

    static int[] xx=new int[]{0,1,-1,0};
    static int[] yy=new int[]{-1,0,0,1};

    private static int dfs(int[][] ma, int a, int b, int x, int y, int max) {
        if (x>a || y>b){
            return max;
        }

        
        max=Math.max(max,ma[a][b]);
        ma[a][b]=0;
        for (int i=0;i<4;i++){
            int newX=x+xx[i];
            int newY=y+yy[i];
            if (!inArea(ma,newX,newX)){
                continue;
            }
            if (ma[newX][newY]==0){
                continue;
            }

            dfs(ma,a,b,newX,newY,max);
        }
        return max;
    }


    private static boolean inArea(int[][] image, int x, int y) {
        return x>=0 && x<image.length && y>=0 && y<image[0].length;
    }
}
