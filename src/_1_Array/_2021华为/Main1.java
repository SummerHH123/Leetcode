package _1_Array._2021华为;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();


        if (m<=0 || n<=0){
            System.out.println(new ArrayList<>());
        }


        List<List<Integer>> list = printMatrix( m, n);
        String s = list.toString();
        String s1 = s.replaceAll(",", ",");
        System.out.println(s1);


        String s2 = strt.toString();
//        s2.replaceAll(',',',');


        System.out.println(list.toString());

        System.out.printf("%s","[");
        for (int i=0;i<strt.size()-1;i++){
            System.out.printf("%s",strt.get(i));
            System.out.printf("%s",",");
        }
        System.out.printf("%s",strt.get(strt.size()-1));
        System.out.printf("%s","]");


    }


    static List<String> strt=new ArrayList<>();
    private static List<List<Integer>> printMatrix(int m, int n) {
        int count=0;
        int l=0,r=m-1,t=0,b=n-1,x=0;

        List<List<Integer>> lists=new ArrayList<>();



        StringBuilder sb=new StringBuilder();
        while (true){
            for (int i=l;i<=r;i++){
                count++;
                if (count>=10 && count%10==7 && count/10%10%2!=0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(t);
                    tmp.add(i);
                    String s="["+t+","+i+"]";
                    strt.add(s);

                    lists.add(tmp);
                }
            }
            if (++t>b){
                break;
            }

            for (int i=t;i<=b;i++){
                count++;

                if (count>=10 && count%10==7 && count/10%10%2!=0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(i);
                    tmp.add(r);
                    String s="["+i+","+r+"]";
                    strt.add(s);
                    lists.add(tmp);
                }
            }
            if (l>--r){
                break;
            }

            for (int i=r;i>=l;i--){
                count++;
                if (count>=10 && count%10==7 && count/10%10%2!=0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(b);
                    tmp.add(i);
                    String s="["+b+","+i+"]";
                    strt.add(s);
                    lists.add(tmp);
                }
            }
            if (t>--b){
                break;
            }

            for (int i=b;i>=t;i--){
                count++;
                if (count>=10 && count%10==7 && count/10%10%2!=0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(i);
                    tmp.add(l);
                    String s="["+i+","+l+"]";
                    strt.add(s);
                    lists.add(tmp);
                }
            }
            if (++l>r){
                break;
            }
        }
        return lists;



    }
}
