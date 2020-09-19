package _1_Array._2021中兴;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-14 10:48
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int jineng=sc.nextInt();
            int blood=sc.nextInt();
            int[][] a=new int[jineng][2];
            for (int i=0;i<jineng;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
            }
            int[][] dp=new int[jineng+1][blood+1];



        }
    }
}
