package _1_Array.算法.排序和查找;

import java.util.LinkedList;
import java.util.Queue;

public class 二分查找左边界 {
    static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 最后要检查 left 越界的情况
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,2,2,3,4};
        int target=2;
        int i = left_bound(numbers, target);
        System.out.println(i);

        Queue<Integer> qu=new LinkedList<>();
//        qu.add();
//        qu.poll()
    }
}
