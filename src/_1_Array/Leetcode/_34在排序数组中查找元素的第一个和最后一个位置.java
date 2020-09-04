package _1_Array.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _34在排序数组中查找元素的第一个和最后一个位置 {

    public static void main(String[] args) {


        int[] nums=new int[]{5,7,7,8,8,10};
        int target=4;
        System.out.println(Arrays.toString(new _34在排序数组中查找元素的第一个和最后一个位置().searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        list.add(searchLeft(nums,target));
        list.add(searchRight(nums,target));

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public int searchLeft(int[] nums, int target){
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (target>nums[mid]){
                left=mid+1;
            }else if (target<nums[mid]){
                right=mid-1;
            }else if (target==nums[mid]){
                right=mid-1;
            }
        }
        if (left>nums.length-1 || nums[left]!=target){
            return -1;
        }
        return left;
    }

    public int searchRight(int[] nums, int target){
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (target>nums[mid]){
                left=mid+1;
            }else if (target<nums[mid]){
                right=mid-1;
            }else if (target==nums[mid]){
                left=mid+1;
            }
        }
        if (right<0 || nums[right]!=target){
            return -1;
        }
        return right;
    }


}
