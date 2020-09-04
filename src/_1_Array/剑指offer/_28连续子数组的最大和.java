package _1_Array.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _28连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i<array.length;i++){
            int sum=0;
            for (int j=i;j<array.length;j++){
                sum+=array[j];
                list.add(sum);
            }
        }
        if (list.size()<=0){
            return 0;
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return list.get(0);
    }

}
