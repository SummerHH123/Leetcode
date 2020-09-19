package _1_Array._2021中兴;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-14 10:42
 */
public class Main1 {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int left=0;
        int right=a.length-1;
        devide(left,right,a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(count);
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.printf("%d %d",sum,count);




    }

    public static void devide(int left,int right,int[] nums){

        if(left==right){
            return;
        }

        int mid=(right+left)>>1;

        devide(left,mid,nums);
        devide(mid+1,right,nums);

        merge(left,mid,right,nums);
    }

    public static void merge(int left,int mid,int right,int[] nums){

        int[] tmp=new int[right-left+1];

        int i=left;

        int j=mid+1;
        int index=0;
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){

                //sum+=mid-i+1;
                tmp[index++]=nums[i++];

            }else {
                if (j-i==1){
                    count++;
                }

                tmp[index++]=nums[j];
                i++;

                //tmp[index++]=nums[i++];
            }
        }
        while(i<=mid){
            tmp[index++]=nums[i++];
        }
        while(j<=right){
            tmp[index++]=nums[j++];
        }

        for(int k=0;k<tmp.length;k++){
            nums[left++]=tmp[k];
        }

    }

}
