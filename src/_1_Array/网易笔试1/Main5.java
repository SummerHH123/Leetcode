package _1_Array.网易笔试1;

import java.util.Arrays;
import java.util.Scanner;






public class Main5{
    public static int n,m;
    public static void updateMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dist = new int[rows][cols];
        for(int[] x : dist) Arrays.fill(x, Integer.MAX_VALUE - 10000);
        //第一遍：左上--->右下
        for(int i = 0;i < rows;i++) {
            for(int j = 0;j < cols;j++) {
                if(matrix[i][j] == 1) {
                    if(i > 0) dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    if(j > 0) dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                }else {
                    dist[i][j] = 0;
                }
            }
        }
        //第二遍：右下--->左上
        for(int i = rows - 1;i >= 0;i--) {
            for(int j = cols - 1;j >= 0;j--) {
                if(i < rows - 1) dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
                if(j < cols - 1) dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(j!=m-1) {
                    System.out.print(dist[i][j]+" ");
                }
                else {
                    System.out.println(dist[i][j]);
                }
            }
        }

    }
    public static String a[]=new String[1005];
    public static int b[][]=new int[1005][1005];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++) {
            a[i]=sc.next();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(a[i].charAt(j)=='0') {
                    b[i][j]=0;
                }
                else {
                    b[i][j]=1;
                }
            }
        }
        updateMatrix(b);

    }


}