package _1_Array._2021广联达;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long[] tmp=new long[4];

        tmp[0]=sc.nextLong();
        tmp[1]=sc.nextLong();
        tmp[2]=sc.nextLong();
        tmp[3]=sc.nextLong();

        Arrays.sort(tmp);

        long res=func(tmp);
        if (res==-1){
            System.out.println(res);
        }else {
            System.out.println(res*4);
        }


    }

    private static long func(long[] tmp) {

        long sum=0;
        for (int i=0;i<4;i++){
            sum+=tmp[i];
        }
        long avg=sum/4;
        int sub=0;
        for (long i=avg;i>=0;i--){
            sub=0;
            for (long item:tmp){
                if (item>i){
                    sub+=(item-i);
                }
            }
            long count=0;
            for (long item:tmp){
                if (i>item){
                    count+=(i-item)*2;
                }
            }
            if (sub==count){
                return i;
            }
        }
        return -1;
    }
}
