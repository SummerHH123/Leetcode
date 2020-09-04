package _1_Array.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class _452引爆气球 {
    public static int findMinArrowShots(int[][] points) {
        if (points.length<=1){
            return points.length;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int count=1;
        int end=points[0][1];
        for (int i=1;i<points.length;i++){
            if (end>=points[i][0]){
                end=Math.min(end,points[i][1]);
            }else {
                count++;
                end=points[i][1];
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(findMinArrowShots(a));
    }
}
