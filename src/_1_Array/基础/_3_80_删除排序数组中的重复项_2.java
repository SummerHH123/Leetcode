package _1_Array.基础;

/**
 * 双指针
 * 慢指针：指向已经符号条件的元素
 * 快指针：遍历数组
 * 由于是比较大于两个重复元素  所以比较慢指针前一个元素是否和快指针所指的元素一样，一样，则不符合条件
 * 不一样，则将快指针指向的元素放到慢指针指向元素的下一个
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_80_删除排序数组中的重复项_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        removeDuplicates(a);


    }

    public static int removeDuplicates(int[] nums) {
        int p=1;
        int q=2;
        if (nums.length<=2){
            return nums.length;
        }
        while (q<nums.length){
            if (nums[p-1]!=nums[q]){
                p++;
                nums[p]=nums[q];

            }
            q++;

        }
        return p+1;


    }
}
