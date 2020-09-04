package _1_Array._01常用.算法.排序;

import java.util.Arrays;
import java.util.LinkedList;

public class 快排 {

    public static void quickSorted(int[] nums,int start,int end){

        if (start>=end){
            return;
        }
        int left=start;
        int right=end;

        int temp=nums[start];
        while (left<right){
            while (left<right && nums[right]>=temp){
                right--;
            }
            while (left<right && nums[left]<=temp){
                left++;
            }
            int temp1=nums[left];
            nums[left]=nums[right];
            nums[right]=temp1;
        }

        nums[start]=nums[left];
        nums[left]=temp;
//
//        System.out.println(left);

//        System.out.println(right);
//        for (int i=0;i<nums.length;i++){
//            System.out.printf("%d ",nums[i]);
//        }
//        System.out.println();
//
        quickSorted(nums,start,left-1);
        quickSorted(nums,left+1,end);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{9,4,6,8,3,10,4,6};
        quickSorted(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

        LinkedList<Integer> linkedList=new LinkedList<>();

        Integer a=122;
        Integer b=122;
        Integer c=-233;
        Integer d=-233;
        System.out.println(a==b);

    }
}
