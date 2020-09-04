package _1_Array.K_SUM类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 双指针
 * 找不重复的三元组
 *先排序  在遍历数组 固定第一个数   将后一个数和最后一个数作为双指针
 */
public class _3_15_三数之和 {
    public static void main(String[] args) {
        int[] a = new int[]{0,0,0};
        List<List<Integer>> lists = threeSum(a);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = 0;
            int pre = i + 1;
            int last = nums.length - 1;
            while (pre < last) {
                sum = nums[i] + nums[pre] + nums[last];
                if (sum == 0) {
                    li.add(Arrays.asList(nums[i], nums[pre], nums[last]));

                    while (pre < last && nums[pre] == nums[pre + 1]) {
                        pre++;
                    }
                    while (pre < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
                    pre++;
                    last--;
                }
                if (sum < 0) {
                    pre++;
                }
                if (sum > 0) {
                    last--;
                }
            }

        }
        return li;
    }

}
