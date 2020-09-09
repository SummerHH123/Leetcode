package _1_Array._2021_中国电信;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 21:34
 */
public class Main4 {
    public static void main(String[] args) {
        List<int[]> list=new ArrayList<>();
        int a,b,c,d;
        for (a=0;a<9;a++){
            c=a;
            d=8-a;
            b=d;

            list.add(new int[]{a,b,c,d});

        }
        for (int i=0;i<list.size();i++){
            int[] ints = list.get(i);
            for (Integer integer:ints){
                System.out.printf("%d ",integer);
            }
            System.out.println();
        }
    }
}
