package _1_Array.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17电话号码 {
    private Map<Character,String> map=new HashMap<>();
    public List<String> letterCombinations(String digits) {



        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder sb =new StringBuilder();


        List<String> ans=new ArrayList<>();
        if (digits==null ||digits.length()==0){
            return ans;
        }


        dfs(sb,ans,digits,0);
        return ans;


    }

    private void dfs(StringBuilder sb,  List<String> ans, String digits,int index) {

        if (index==digits.length()){
            ans.add(sb.toString());
            return;
        }

        String word=map.get(digits.charAt(index));
        for (int i=0;i<word.length();i++){

            sb.append(word.charAt(i));


            dfs(sb,ans,digits,index+1);



            sb.deleteCharAt(sb.length()-1);
        }

    }

    public static void main(String[] args) {

        String s="23";
        System.out.println(new _17电话号码().letterCombinations(s));
    }
}
