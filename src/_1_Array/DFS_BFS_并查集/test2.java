package _1_Array.DFS_BFS_并查集;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] a=new double[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        Arrays.sort(a);

        double black_count=0;
        double white_count=0;
        if (n%2!=0){
            double count1=Math.PI*a[0]*a[0];
            black_count+=count1;
            for (int i=1;i<n;i++){
                if (i%2!=0){
                    white_count+=Math.PI*a[i]*a[i];
                }else {
                    black_count+=Math.PI*a[i]*a[i];
                }
            }
        }else {
            double count1=Math.PI*a[0]*a[0];
            white_count+=count1;

            for (int i=1;i<n;i++){
                if (i%2==0){
                    white_count+=Math.PI*a[i]*a[i];
                }else {
                    black_count+=Math.PI*a[i]*a[i];
                }
            }
        }
        System.out.printf("%.5f",black_count-white_count);

    }
}
