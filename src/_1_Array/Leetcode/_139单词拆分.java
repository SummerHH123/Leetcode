package _1_Array.Leetcode;

import java.util.*;

public class _139单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<Character> hashSet=new HashSet<>();

        for (String word:wordDict){
            for (int i=0;i<word.length();i++){
                hashSet.add(word.charAt(i));
            }
        }

        for (int i=0;i<s.length();i++){
            if (!hashSet.contains(s.charAt(i))){
                return false;
            }
        }



       return dfs(s,wordDict,"",new HashMap<>());
    }

    private boolean dfs(String s, List<String> wordDict, String s1,HashMap<String,Boolean> map) {


        if (s1.length()>s.length()){
            return false;
        }
        if (map.containsKey(s1)){
            return map.get(s1);
        }

        if (s1.length()==s.length()){
            if (s1.equals(s)){
                return true;
            }
        }




        for (int i=0;i<s1.length();i++){
            if (s.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }

        for (String word:wordDict){
            if (dfs(s,wordDict,s1+word,map)){
                map.put(s1+word,true);
                return true;
            }else {
                map.put(s1+word,false);
            }

        }


        return false;


    }

    public static void main(String[] args) {
//        "bb"
//["a","b","bbb","bbbb"]
        String s = "bb";
        String[] wordDict = new String[]{"a","b","bbb","bbbb"};

        List<String> list=Arrays.asList(wordDict);


        System.out.println(new _139单词拆分().wordBreak(s, list));
    }
}
