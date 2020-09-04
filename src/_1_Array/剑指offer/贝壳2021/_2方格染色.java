package _1_Array.剑指offer.贝壳2021;

import javax.swing.text.MaskFormatter;
import java.util.Scanner;

public class _2方格染色 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (n==1 && m==1){
                System.out.println(1);
                return;
            }
            if (n==1 || m==1){
                int x=n;
                if (x==1){
                    x=m;
                }
                int ans=x;
                for (int j=2;j*j<=x;j++){
                    if (x%j==0){
                        ans=Math.min(ans,j);
                    }
                }
                System.out.println(ans);
                return;
            }
            int ans=Math.min(n,m);
            for (int j=2;j*j<=n;j++){
                if (n%j==0){
                    ans=Math.min(ans,j);
                }
            }
            for (int j=2;j*j<=m;j++){
                if (m%j==0){
                    ans=Math.min(ans,j);
                }
            }
            System.out.println(ans);
        }
    }
}
