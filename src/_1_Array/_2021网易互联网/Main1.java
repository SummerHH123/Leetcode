package _1_Array._2021网易互联网;

import java.awt.event.MouseAdapter;
import java.util.*;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 14:38
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int node=sc.nextInt();
        int edge=sc.nextInt();
        sc.nextLine();

        HashMap<Integer, List<Integer>> tree=new HashMap<>();

        for (int i=0;i<edge;i++){
            String tmp=sc.nextLine();
            String[] s = tmp.split(" ");
            int fa=Integer.valueOf(s[0]);
            int child=Integer.valueOf(s[2]);

            List<Integer> list1 = tree.get(fa);
            if (list1==null || list1.size()==0){
                List<Integer> list=new ArrayList<>();
                list.add(child);
                tree.put(fa,list);
            }else if (list1.size()==1){
                List<Integer> tmp2 = tree.get(fa);
                tmp2.add(child);
                tree.put(fa,tmp2);
            }
        }
        HashSet<Integer> set1=new HashSet<>();
        for (Map.Entry entry:tree.entrySet()){
            set1.add((int)entry.getKey());
        }
        HashSet<Integer> set2=new HashSet<>();
        List<Integer> yezi=new ArrayList<>();
        for (Map.Entry entry:tree.entrySet()){
            List list = (List) entry.getValue();
            for (int i=0;i<list.size();i++){
                if (!set1.contains(list.get(i))){
                    yezi.add((int) list.get(i));
                }
            }
        }
        List<Integer> fu=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (Map.Entry entry:tree.entrySet()){
            List<Integer> li=(List<Integer>) entry.getValue();
            for (int i=0;i<li.size();i++){
                if(yezi.contains(li.get(i))){
                    int key = (int)entry.getKey();
                    map.put(key,map.getOrDefault(key,0)+1);
                }
            }
        }

        int count=0;
        for (Map.Entry entry:map.entrySet()){
            if((int)entry.getValue()==2){
                count++;
            }
        }
        System.out.println(count);



    }

}
