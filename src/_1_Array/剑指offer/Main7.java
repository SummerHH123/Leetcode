package _1_Array.剑指offer;

import java.util.*;

public class Main7 {

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList(5);
//        for (int i=0;i<15;i++){
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);

        List<String> list  =   new  ArrayList<String>();
        list.add("caa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");

        TreeSet<String> set = new TreeSet<>(list);

        List<String> newList = new  ArrayList(set);
//        for (String cd:list) {
//            if(set.add(cd)){
//                newList.add(cd);
//            }
//        }
        System.out.println( "去重后的集合： " + newList);
    }

}
