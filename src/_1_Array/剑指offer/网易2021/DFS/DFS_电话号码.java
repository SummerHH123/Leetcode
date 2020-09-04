package _1_Array.剑指offer.网易2021.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS_电话号码 {

        static Map<Character, String> map;
        static {
            map = new HashMap<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
        }
        static List<String> results = new ArrayList<>();
        public List<String> letterCombinations(String digits) {

            if (digits == null || digits.length() == 0) {
                return results;
            }

            dfs(digits, 0, map, new ArrayList<String>(), results);
            return results;
        }

        private void dfs(String digits, int index, Map<Character, String> map, ArrayList<String> subsets, List<String> results) {
            if(index == digits.length()) {
                results.add(String.join("", subsets));
                return;
            }


            String res = map.get(digits.charAt(index));
            for (int i = 0; i < res.length(); i++) {
                subsets.add(res.charAt(i) + "");
                dfs(digits, index + 1, map, subsets, results);
                subsets.remove(subsets.size() - 1);
            }
        }


}
