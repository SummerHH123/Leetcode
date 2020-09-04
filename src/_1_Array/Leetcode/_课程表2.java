package _1_Array.Leetcode;

import java.util.*;

public class _课程表2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] inde = new int[numCourses];

        for (int[] in : prerequisites) {
            inde[in[0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (inde[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int out = queue.poll();
            result.add(out);

            for (int[] in : prerequisites) {
                if (in[1] == out) {
                    inde[in[0]]--;
                    if (inde[in[0]] == 0) {
                        queue.offer(in[0]);
                    }
                }
            }
        }

        if (result.size() != numCourses) {

            return new int[]{};
        } else {
            return result.stream().mapToInt(Integer::valueOf).toArray();

        }
    }

    public static void main(String[] args) {

        int numcourse = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        System.out.println(Arrays.toString(new _课程表2().findOrder(numcourse, prerequisites)));

    }
}
