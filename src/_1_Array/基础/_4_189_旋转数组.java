package _1_Array.基础;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 原地移动
 * 暴力 旋转k次
 */
public class _4_189_旋转数组 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        rotate(a,k);



    }

    public static void rotate(int[] nums, int k) {
        for (int i=0;i<k;i++){
            int pre=nums[nums.length-1];
            for (int j=0;j<nums.length;j++){
                int temp=nums[j];
                nums[j]=pre;
                pre=temp;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
