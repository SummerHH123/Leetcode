package _1_Array._2021美团;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] ans=new int[n][2];

        int[][] a=new int[n][2];
        for (int i=0;i<n;i++){
            int v=sc.nextInt();
            int w=sc.nextInt();
            a[i][0]=v;
            a[i][1]=w;
        }
        for (int i=0;i<n;i++){
            ans[i][0]=i+1;
            ans[i][1]=a[i][0]+a[i][1]*2;
        }




        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }else {
                    return o2[1]-o1[1];
                }

            }
        });



        for (int i=0;i<m-1;i++){
            System.out.printf("%d ",ans[i][0]);
        }
        System.out.printf("%d",ans[m-1][0]);


    }

}
