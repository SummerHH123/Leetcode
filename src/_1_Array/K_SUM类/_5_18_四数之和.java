package _1_Array.K_SUM类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5_18_四数之和 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 0, -1, 0, -2, 2};
        int[] b=new int[]{0,0,0,0};
        int target = 0;
        List<List<Integer>> lists = fourSum(b, target);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        int index1;
//        int index2;
        List<List<Integer>> li = new ArrayList<>();
        int start;
        int end;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {//确保指针变化
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j>i+1&&nums[j - 1] == nums[j]) {//确保指针变化
                    continue;
                }
                start = j + 1;
                end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum > target) {
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        li.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start+1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end-1]) {
                            end--;
                        }
                        start++;
                        end--;
                    }

                }
            }
        }
        return li;

    }

}
