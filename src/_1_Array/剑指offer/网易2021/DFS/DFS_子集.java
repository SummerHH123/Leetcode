package _1_Array.剑指offer.网易2021.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS_子集 {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null) {
            return results;
        }
        if (nums.length == 0) {
            results.add(new ArrayList<>());
            return results;
        }

        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), results);

        return results;
    }

    private void dfs(int[] nums, int index, List<Integer> subsets, List<List<Integer>> results) {
        results.add(new ArrayList<>(subsets));
        for (int i = index; i < nums.length; i++) {

            if(i > index && nums[i] == nums[i - 1]) continue;//可能包含重复元素

            subsets.add(nums[i]);
            dfs(nums, i + 1, subsets, results);
            subsets.remove(subsets.size() - 1);
        }
    }
}
