package _1_Array.网易笔试1;

import java.util.Arrays;
import java.util.Scanner;

public class 最大公约数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n+1];

        for (int i=1;i<=n;i++){
            a[i]=sc.nextLong();
        }
        int flag=0;
        for (int i=2;i<=n;i++){
            if (a[i]-a[i-1]<=0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("-1");
        }else {
            long ans=a[2]-a[1];
            for (int i=3;i<=n;i++){
                ans=gcd(ans,a[i]-a[i-1]);
            }
            System.out.println(ans);
        }
    }

    private static long gcd(long a, long b) {

        return b==0?a:gcd(b,a%b);
    }
}
