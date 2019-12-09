package _1_Array.基础;

import java.util.Scanner;

/**
 * 双指针 p   i
 */
public class _2_26_删除排序数组中的重复项 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int val=sc.nextInt();

        removeDuplicates(a);




    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length==0||nums==null){
            return 0;
        }
        int p=0;
        for (int i=1;i<nums.length;i++){
            if (nums[p]!=nums[i]){
                nums[p+1]=nums[i];
                p++;
            }

        }
        return p+1;

    }
}
