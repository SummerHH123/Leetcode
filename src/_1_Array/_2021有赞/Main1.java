package _1_Array._2021有赞;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-11 13:28
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(sum(3,5));

        System.out.println("\"");

    }
    public static long sum (int num, int itemNum) {
        // write code here

        List<String> list=new ArrayList<>();
        long sum=0;

       for (int i=0;i<itemNum;i++){
           String tmp="";
           for (int j=0;j<=i;j++){
               tmp+=String.valueOf(num);

           }
           list.add(tmp);
       }
       for (int i=0;i<list.size();i++){
           sum+=Long.valueOf(list.get(i));
       }
        return sum;

    }
}
