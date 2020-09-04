package _1_Array.剑指offer.网易2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
   static int[] a=new int[25];
   static int[] num1=new int[25];

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            for (int i=0;i<(1<<n);i++){
                for (int j=0;j<n;j++){
                    num1[n-1-j]=i>>j&1;
                }

                List<Integer> tmp=new ArrayList<>();
                int sum=0;
                for (int j=0;j<n;j++){
                    if (num1[j]==1){
                        tmp.add(a[j]);
                    }else {
                        sum+=a[j];
                    }
                }
//                if (canPartition(tmp)){
//                    ans=Math.min(ans,sum);
//                }

            }
            System.out.println(ans);
        }
    }

//   static boolean canPartition(List<Integer> nums){
////        int sum=
//
//   }
}
