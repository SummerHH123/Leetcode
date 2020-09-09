package _1_Array._2021华为;

import java.util.Arrays;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 16:33
 */
public class 爬楼梯1 {
    public static void main(String[] args) {

        System.out.println(climb(6));
        System.out.println(climb2(6));

        int[] a=new int[3];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        int[] b=new int[3];
        int[] ints = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(ints));
        System.arraycopy(a,0,b,0,2);
        System.out.println(Arrays.toString(b));
    }
    public static int climb(int flow){
        if (flow==1){
            return 1;
        }
        int[] dp=new int[flow+1];
        dp[0]=1;

        dp[1]=1;

        for (int i=2;i<=flow;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[flow];

    }

    public static int climb2(int flow){
        if (flow==1){
            return 1;
        }
        int first=1;
        int second=1;

        int cur=0;
        for (int i=2;i<=flow;i++){
            cur=first+second;
            first=second;
            second=cur;
        }

        return second;
    }



}
