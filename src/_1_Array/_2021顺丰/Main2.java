package _1_Array._2021顺丰;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n+1];

        for (int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int[] f=new int[n+1];

        for (int i=1;i<=n;i++){
            f[i]=f[i-1]+a[i];
        }
        f[0]=0;
        int[] dp=new int[n+1];
        int[] ans=new int[n+1];

        for (int i=1;i<=k;i++){
            for (int j=n;j>=i;j--){
                dp[j]=0;
                for (int l=i-1;l<=j;l++){
                    int tmp=(f[j]-f[l])*(f[j]-f[l]);
                    if (dp[j]<dp[l]+tmp){
                        dp[j]=dp[l]+tmp;
                        ans[j]=Math.max(ans[l],j-l);
                    }else if (dp[j]==dp[l]+tmp){
                        ans[j]=Math.min(ans[j],Math.max(ans[l],j-l));
                    }
                }
            }
        }
        System.out.println(dp[n]+" "+ans[n]);

    }
}
