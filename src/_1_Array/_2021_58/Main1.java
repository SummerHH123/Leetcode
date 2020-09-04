package _1_Array._2021_58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {




    }
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
//        int len =values.size();
        ArrayList<Map<String,Integer>> list=new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        for (int i=0;i<values.size();i++){
            Map<String,Integer> map=new HashMap<>();
            for (int j=0;i<values.get(i).size();j++){
                if(!map.containsKey(values.get(i).get(j)))
                    map.put(values.get(i).get(j),1);
            }
            list.add(map);
        }
        if (list.size()==0){
            return ans;
        }
        for (String key:list.get(0).keySet()){
            int flag=1;
            for (int j=0;j<list.size();j++){
                if (!list.get(j).containsKey(key)){
                    flag=0;
                }
            }
            if (flag==1){
                ans.add(key);
            }
        }
       return ans;

    }
}
