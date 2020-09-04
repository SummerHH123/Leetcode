package _1_Array.Leetcode;

import java.util.*;

public class _692topk {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map=new HashMap<>();

        ArrayList<String> arrayList=new ArrayList<>();


        for (String word:words){
            int count=map.getOrDefault(word,0);
            count++;
            map.put(word,count);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<Map.Entry<String,Integer>>(k + 1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue()==o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }else {
                    return o2.getValue()-o1.getValue();
                }
            }
        });

        for (Map.Entry entry:map.entrySet()){
            pq.offer(entry);
        }
        for (int i=0;i<k;i++){
            arrayList.add(pq.poll().getKey());
        }

        return arrayList;

    }

    public static void main(String[] args) {
        String[] words=new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k=2;
        System.out.println(new _692topk().topKFrequent(words, k));
    }
}
