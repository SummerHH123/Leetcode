package _1_Array._2021美团;

import java.util.*;
//import javafx.*;
public class MainTest {


    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        Map<Integer,Integer> map=new TreeMap<>(new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
              return o1-o2;
          }
      });


        for (int i=0;i<n;i++){
            int v=sc.nextInt();
            int w=sc.nextInt();
            map.put(i,-(v+w*2));
        }
        for (Map.Entry en:map.entrySet()){
            System.out.println(en.getKey());
        }
        System.out.println("======");




        int[] res=new int[m];
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        int index=0;
        while (iterator.hasNext() && index<m){
                res[index]=iterator.next().getValue()+1;
                index++;

            }

        Arrays.sort(res,0,m);


        System.out.printf("%d",res[0]);
        for (int i=1;i<m;i++){
            System.out.printf(" %d",res[i]);
        }



    }
}
