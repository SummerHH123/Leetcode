package _1_Array.Leetcode;

public class _151翻转字符串里的单词 {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(new _151翻转字符串里的单词().reverseWords(s));


    }
    public String reverseWords(String s) {
        String s1=s.trim();
        StringBuilder ans=new StringBuilder();

        int slow=s1.length()-1;
        int fast=s1.length()-1;
        while (fast>=0){
            if (s1.charAt(fast)!=' '){
                fast--;
            }else {
                ans.append(s1.substring(fast+1,slow+1)+' ');
                while (fast>=0 && s1.charAt(fast)==' '){
                    fast--;
                }
                slow=fast;
            }
        }
        ans.append(s1.substring(fast+1,slow+1));

        return ans.toString().trim();


    }
}
