package _1_Array.基础;

import java.util.Scanner;

/**
 * 移除数组中的元素
 * 两个指针
 * 一个查找元素p快指针
 * 一个替换记录q慢指针
 */

public class _1_27_Remove_Element {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int val=sc.nextInt();

        int i = removeElement(a, val);
        System.out.println(i);

    }

    public static int removeElement(int[] nums, int val) {
        int p;
        int q=0;
        for (p=0;p<nums.length;p++){
            if (nums[p]!=val){
                nums[q]=nums[p];
                q++;
            }
        }
        return q;
    }



}
