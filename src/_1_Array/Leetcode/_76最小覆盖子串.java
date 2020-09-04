package _1_Array.Leetcode;

import java.util.HashMap;

public class _76最小覆盖子串 {

    public static void main(String[] args) {
        String S = "ADOBEODEBAN", T = "ABC";
        System.out.println(new _76最小覆盖子串().minWindow(S, T));

    }
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> windows=new HashMap<>();
        HashMap<Character,Integer> needs=new HashMap<>();
        for (int i=0;i<t.length();i++){
            needs.put(t.charAt(i),needs.getOrDefault(t.charAt(i),0)+1);
        }


        int start=0;
        int end=0;

        int minLen=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int match=0;
        while (right<s.length()){
            char c1=s.charAt(right);
            if (needs.containsKey(c1)){
                windows.put(c1,windows.getOrDefault(c1,0)+1);
                if (needs.get(c1).compareTo(windows.get(c1))==0){
                    match++;
                }
            }
            right++;




            while (match==needs.size()){
                if (right-left+1<minLen){
                    start=left;
                    end=right;
                    minLen=right-left+1;
                }
                char c2=s.charAt(left);

                if (needs.containsKey(c2)){
                    windows.put(c2,windows.get(c2)-1);
                    if (windows.get(c2).compareTo(needs.get(c2))<0){
                        match--;
                    }

                }
                left++;
            }
        }

        return minLen==Integer.MAX_VALUE?"":s.substring(start,end);

    }
}
