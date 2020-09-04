package _1_Array.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22括号 {
    public List<String> generateParenthesis(int n) {

        List<String> list=new ArrayList<>();

        dfs(list,n,n);
        return list;

    }


    StringBuilder path=new StringBuilder();

    private void dfs(List<String> list, int left, int right) {

        if (left==0 && right==0){
            list.add(path.toString());
            return;
        }
        if (left>right){
            return;
        }
        for (int i=0;i<2;i++){
            if (i==0 && left>0){
                path.append("(");
                dfs(list,left-1,right );
                path.deleteCharAt(path.length()-1);
            }
            if (i==1 && right>0){
                path.append(")");
                dfs(list,left,right-1);
                path.deleteCharAt(path.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(new _22括号().generateParenthesis(n));
    }
}
