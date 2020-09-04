package _1_Array.K_SUM类;

import java.util.Arrays;
import java.util.HashMap;

public class _2_167_两数之和II {
    public static void main(String[] args) {
        int[] a=new int[]{2,7,11,15};
        int target=9;
        int[] ints = twoSum(a, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            mp.put(numbers[i],i);
        }
        int index1=0,index2=0;
        for (int i=0;i<numbers.length;i++){
            int x=target-numbers[i];
            if (mp.containsKey(x)&&mp.get(x)!=i){
                index1=i+1;
                index2=mp.get(x)+1;
            }
        }
        int[] a=new int[]{index1,index2};
        Arrays.sort(a);
        return a;


    }
}
