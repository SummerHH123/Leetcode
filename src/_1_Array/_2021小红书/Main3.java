package _1_Array._2021小红书;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[n][m];
        for (int  i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }




    }
}
