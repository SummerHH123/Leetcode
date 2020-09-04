package _1_Array._2021广联达;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long[] tmp=new long[4];

        tmp[0]=sc.nextLong();
        tmp[1]=sc.nextLong();
        tmp[2]=sc.nextLong();
        tmp[3]=sc.nextLong();

        Arrays.sort(tmp);

        long left=tmp[0];
        long right=tmp[3];

        long ans=0;
        long mid;

        while (left<=right){
            mid=(left+right)/2;

            if(judg(tmp,mid)){
                ans=Math.max(ans,mid);
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        System.out.println(ans*4);



    }

    private static boolean judg(long[] cc, long mid) {
        long tmp=0;
        long[] c;
        c=Arrays.copyOfRange(cc,0,4);
        for (int i=3;i>=0;i--){
            if (c[i]>mid){
                if ((c[i]-mid)%2==1){
                    tmp+=(c[i]-mid+1)/2;
                    c[i]=mid-1;
                }else {
                    tmp+=(c[i]-mid)/2;
                    c[i]=mid;
                }
            }
        }
        for (int i=0;i<=3;i++){
            if (c[i]==mid){
                continue;
            }else {
                if (mid-c[i]<=tmp){
                    tmp=tmp-(mid-c[i]);
                }else {
                    return false;
                }
            }
        }
        if (tmp>0){
            return false;
        }
        return true;
    }
}
