package _1_Array.剑指offer.网易2021.排序和查找;

public class 二分查找右边界 {
    static int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,2,2,3,4};
        int target=-1;
        int i = right_bound(numbers, target);
        System.out.println(i);
    }
}
