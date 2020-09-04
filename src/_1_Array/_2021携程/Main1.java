package _1_Array._2021携程;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        int k=sc.nextInt();

        Set<Long> set=new HashSet<>();
        List<Long> list=new ArrayList<>();
        if (k==0){
            System.out.println(list);
        }else {
            for (int i=0;i<=k;i++){
                long ans=a*i+b*(k-i);
                set.add(ans);
            }
            Iterator it=set.iterator();
            while (it.hasNext()){
                list.add((Long) it.next());
            }


            Collections.sort(list);

            System.out.println(list.toString());
        }



    }
}
