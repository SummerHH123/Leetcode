package _1_Array.Leetcode;

import java.util.HashMap;

public class _242有效字母异位 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> t1=new HashMap<>();
        for (char c:s.toCharArray()){
            s1.put(c,s1.getOrDefault(c,0)+1);
        }

        for (char c2:t.toCharArray()){
            t1.put(c2,t1.getOrDefault(c2,0)+1);
        }
        if (s1.size()!=t1.size()){
            return false;
        }
        for (char c:s.toCharArray()){
            if (!s1.get(c).equals(t1.getOrDefault(c,0))){
                return false;
            }
        }
        return true;
    }

}
