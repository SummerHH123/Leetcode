package _1_Array._2021_3602;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[] data=new int[n];
        split11(n,n,data,0);



    }
    public static int split11(int sum,int max,int[] data,int index){
        if(max>sum) max=sum;
        if (sum<1 || max<1) return 0;
        if (sum==1 || max==1){
            if(sum==1){
                data[index]=sum;
            }else {
                for (int i=0;i<sum;i++){
                    data[index]=max;
                }
                return 1;
            }

        }
        if (sum==max){
            data[index]=max;
            return 1+split11(sum,max-1,data,index);
        }else if (sum>max){
            data[index]=max;
            return split11(sum-max,max,data,index+1)+split11(sum,max-1,data,index);
        }else {
            return split11(sum,sum,data,index);
        }
    }


}
