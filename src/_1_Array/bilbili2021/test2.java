package _1_Array.bilbili2021;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] split = str.split(",");
        Arrays.sort(split, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
//                return o2.compareTo(o1);
            }
        });

        StringBuilder stb=new StringBuilder();
        for (String s:split){
            stb.append(s);
        }
        System.out.println(stb.toString());
    }
}
