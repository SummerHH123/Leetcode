package _1_Array.剑指offer.网易2021.DFS;

import java.util.ArrayList;
import java.util.List;

public class DFS_排列组合 {
        List<List<Integer>> results = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {

            if (n == 0) {
                return results;
            }
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }

            dfs(nums, 0, new ArrayList<>(), k);

            return results;
        }

        private void dfs(int[] nums, int index, ArrayList<Integer> subsets, int k) {
            if(subsets.size() == k) {
                //Set<Integer> set=new HashSet<>(subsets);
                results.add(new ArrayList<>(subsets));
            }

            for (int i = index; i < nums.length; i++) {
                if(i > index && nums[i] == nums[i - 1]) continue;
                subsets.add(nums[i]);
                //组合 没有先后顺序
                dfs(nums, i + 1, subsets, k);

                subsets.remove(subsets.size() - 1);
            }
        }


}
