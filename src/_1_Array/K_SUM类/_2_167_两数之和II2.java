package _1_Array.K_SUM类;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 双指针
 */
public class _2_167_两数之和II2 {
    public static void main(String[] args) {
        int[] a=new int[]{2,7,11,15};
        int target=9;
        int[] ints = twoSum(a, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }


    public static int[] twoSum(int[] numbers, int target) {
        //给定的是有序数组
        int index1=0;//头指针
        int index2=numbers.length-1;//尾指针

        while (index1<index2){
            int sum=numbers[index1]+numbers[index2];
            if (sum==target){
                break;
            }
            if (sum>target){
                index2--;
            }
            if (sum<target){
                index1++;
            }
        }
        return new int[]{index1+1,index2+1};





    }

}
