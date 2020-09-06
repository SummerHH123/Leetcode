package _1_Array._2021腾讯;

import java.util.*;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-06 20:46
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        sc.nextLine();
        Map<String,Integer> map=new HashMap<>();
        while (N-->0){
            String str=sc.nextLine();
            Integer integer = map.get(str);
            if (integer==null){
                map.put(str,1);
            }else {
                map.put(str,integer+1);
            }

        }

        List<Map.Entry<String,Integer>> inlist=new ArrayList<>(map.entrySet());

        Collections.sort(inlist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())){

                    return o1.getKey().toString().compareTo(o2.getKey());
                }else {
                    return o2.getValue()-(o1.getValue());
                }
            }
        });




        String[] str1=new String[K];

        String[] count1=new String[K];
        for (int i=0;i<K;i++){
            String tmp=inlist.get(i).toString();
            String[] split = tmp.split("=");
            str1[i]=split[0];
            count1[i]=split[1];
        }

        Collections.sort(inlist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())){
                    return o1.getKey().toString().compareTo(o2.getKey());
                }else {
                    return o1.getValue()-(o2.getValue());
                }
            }
        });


        String[] count2=new String[K];
        String[] str2=new String[K];
        for (int i=0;i<K;i++){
            String tmp=inlist.get(i).toString();
            String[] split = tmp.split("=");

            str2[i]=split[0];
            count2[i]=split[1];

        }

        for (int i=0;i<K;i++){
            System.out.printf("%s %s",str1[i],count1[i]);
            System.out.println();
        }

        for (int i=0;i<K-1;i++){
            System.out.printf("%s %s",str2[i],count2[i]);
            System.out.println();
    }
        System.out.printf("%s %s",str2[K-1],count2[K-1]);


    }
}
