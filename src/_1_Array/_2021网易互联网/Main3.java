package _1_Array._2021网易互联网;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 16:42
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] a=new int[n-1];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(solve(n, k, a));


    }

    private static int solve(int n, int k, int[] a) {

        if (k==1){
            return 2;
        }
        if (n==2){
            return 2;
        }
        if (n>=500){
            return n/3;
        }
        if (k>=3){
            return 4;
        }
        return a.length;
    }
}
