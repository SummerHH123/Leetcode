package _1_Array.剑指offer;

import java.util.HashMap;

public class _26数组超过一半的出现次数 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0;
        int target=0;
        for (int number: array){
            map.put(number,map.getOrDefault(number,0)+1);
            if (sum<map.get(number)){
                sum=map.get(number);

                target=number;
            }
        }
        if (sum>array.length/2){
            return target;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,2,2,2,5,4,2};
        int i = MoreThanHalfNum_Solution(arr);
        System.out.println(i);
    }
}
