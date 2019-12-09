package _1_Array.基础;

import java.util.Scanner;

/**
 * 桶排序的思想
 * 下标代表正数
 * 如果输入的数字小于数组大小的最大值、值不为负值、并且下标和数字的值所在的下标不相等的话    进行排序
 */
public class _5_41_缺失的第一个正数 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        int i = firstMissingPositive(a);
        System.out.println(i);

    }

    public static int firstMissingPositive(int[] nums) {
        int len=nums.length;

        for (int i=0;i<len;i++){
            while (nums[i]<len&&nums[i]>0&&nums[nums[i]-1]!=nums[i]){
                if (nums[i]==i+1){
                    break;
                }

                int index1=nums[i]-1;
                int index2=i;
                int temp=nums[index1];
                nums[index1]=nums[index2];
                nums[index2]=temp;
            }
        }

        for (int i=0;i<len;i++){
            if ((i+1)!=nums[i]){
                return i+1;
            }
        }

        return nums.length+1;
    }


}
