package _1_Array.剑指offer.网易2021.排序和查找;

import java.util.Arrays;

public class 快速排序 {

    public int partion(int[] nums, int start, int end) {
        int num = nums[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left <= end && nums[left] <= num) left++;
            while (right >= start && nums[right] > num) right--;

            if (left < right) {
                swap(nums, left, right);
            }

        }
        swap(nums, start, right);
        return right;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sort(int[] nums, int start, int end) {

        if (end - start < 1) {
            return;
        }
        int index = partion(nums, start, end);
        sort(nums, start, index - 1);
        sort(nums, index + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 1, 5, 2, 3, 7, 2};
        new 快速排序().sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


}
