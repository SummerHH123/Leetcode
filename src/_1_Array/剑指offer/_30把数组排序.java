package _1_Array.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _30把数组排序 {
    public String PrintMinNumber(int [] numbers) {

        ArrayList<String> li=new ArrayList<>();
        for (int num:numbers){
            li.add(String.valueOf(num));
        }

        Collections.sort(li, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o11=o1+o2;
                String o22=o2+o1;
                return o11.compareTo(o22);
            }
        });
        StringBuilder sb=new StringBuilder();
        for (String nu:li){
            sb.append(nu);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        return sb.toString();
    }
}
