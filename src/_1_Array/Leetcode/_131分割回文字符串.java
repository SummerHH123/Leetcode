package _1_Array.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _131分割回文字符串 {

    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();

        if (s.length()==0){
            return ans;
        }

        List<String> path=new ArrayList<>();

        dfs(0,path,s,ans);
        return ans;


    }

    private void dfs(int start, List<String> path, String s,List<List<String>> ans) {
        if ((start==s.length())){
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i=start;i<s.length();i++){

            if (!isHuiWen(s,start,i)){
                continue;
            }

            path.add(s.substring(start,i+1));
            dfs(i+1,path,s,ans);

            path.remove(path.size()-1);

        }
    }

    private boolean isHuiWen(String s,int start, int end) {
        int left=start;
        int right=end;

        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s="aab";
        System.out.println(new _131分割回文字符串().partition(s));
    }
}
