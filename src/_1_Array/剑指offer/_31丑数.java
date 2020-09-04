package _1_Array.剑指offer;


import java.util.HashSet;
import java.util.PriorityQueue;

public class _31丑数 {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue();
        HashSet<Long> set=new HashSet<>();
        long[] number=new long[]{2,3,5};
        for (long num:number){
            pq.offer(num);
        }

        long min=1;
        for (int i=1;i<n;i++){
            min=pq.poll();
            for (int j=0;j<3;j++){
                if (!set.contains(number[j]*min)){
                    pq.offer(min*number[j]);
                    set.add(min*number[j]);
                }
            }
        }
        return (int)min;

    }
}
