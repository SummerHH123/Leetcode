package _1_Array._2021京东;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
       while (m-->0){

            int op=sc.nextInt();
            if (op==3){
                System.out.println(list.toString());
               break;
           }
            if (op==1){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if (list.size()>(a-1)){
                    list.add(a-1,b);

                }else {
                    list.add(b);
                }

            }else if (op==2){
                int a=sc.nextInt();
                list.remove(a-1);
            }
        }
    }
}
