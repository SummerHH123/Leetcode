package _1_Array.bilbili2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {

    public static boolean Game24Points(int[] arr) {
        List<Double> nums = new ArrayList<>();

        for (int num : arr) {
            nums.add((double) num);
        }

        return dfs(nums);
    }

    private static boolean dfs(List<Double> number) {
        if (number.size() == 1) {
            return Math.abs(number.get(0) - 24) < (1e-6);
        }
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < number.size(); j++) {
                if (i != j) {
                    List<Double> nums1 = new ArrayList<>();
                    for (int k = 0; k < number.size(); k++) {
                        if (k != i && k != j) {
                            nums1.add(number.get(k));
                        }
                    }
                    Set<Double> set = com(number.get(i), number.get(j));
                    for (Double sset : set) {
                        nums1.add(sset);
                        if (dfs(nums1)) {
                            return true;
                        }
                        nums1.remove(nums1.size() - 1);
                    }

                }

            }
        }
        return false;
    }

    private static Set<Double> com(double a, double b) {
        Set<Double> res = new HashSet<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (a != 0) {
            res.add(b / a);
        }
        if (b != 0) {
            res.add(a / b);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Game24Points(new int[]{7, 2, 1, 10}));
    }
}
