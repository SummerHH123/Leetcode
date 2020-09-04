package _1_Array.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class _27最小k个数 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> array=new ArrayList<>();
        if (input == null || input.length == 0 || k>input.length || k<1) {
            return array;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i=0;i<input.length;i++){
            if (i<k){
                pq.offer(input[i]);
                continue;
            }
            if (pq.peek()>input[i]){
                pq.poll();
                pq.offer(input[i]);
            }

        }


        return new ArrayList<>(pq);


    }

    public static void main(String[] args) {
        int[] arr=new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> arrayList = GetLeastNumbers_Solution(arr, 4);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
//class com implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return 0;
//    }
//}
