package _1_Array;

import java.util.Scanner;

public class Main6 {
    public static int vis[]=new int[100005];
    public static int dp[][]=new int[1005][1005];

    public static String s[]={"surprise", "happy", "ctrip", "travel", "wellcome","student","system","program","editor"};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int k=0;k<9;k++){
            char a[]=new char[1005];
            char b[]=new char[1005];
            int len1=str.length();
            int len2=s[k].length();
            for (int i=0;i<len1;i++){
                a[i+1]=str.charAt(i);
            }
            for (int i=0;i<len2;i++){
                b[i+1]=s[k].charAt(i);
            }
            for (int i=1;i<len1;i++)
                for (int j=1;j<=len2;j++)
                    dp[i][j]=0x3f3f3f;
            for (int i=1;i<=len1;i++)
                dp[i][0]=i;
            for (int j=1;j<=len2;j++)
                dp[0][j]=j;
            for (int i=1;i<=len1;i++){
                for (int j=1;j<=len2;j++){
                    int flag;
                    if (a[j]==b[j])
                        flag=0;
                    else
                        flag=1;
                    dp[i][j]=Math.min(dp[i-1][j]+1,Math.min(dp[i][j-1]+1,dp[i-1][j-1]+flag));
                }
            }

            if (dp[len1][len2]<=2){
                System.out.println(s[k]);
                return;
            }

        }
    }
}
