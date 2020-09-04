package _1_Array.Leetcode;

public class _8字符串转整数 {
    public int myAtoi(String str) {

        int len=str.length();
        if (len==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();


        int index=0;
        while (index<len && str.charAt(index)==' '){
            index++;
        }


        int flag=0;
        if (index<len && str.charAt(index)=='-'){
            flag=1;
            index++;
        }else if (index<len && str.charAt(index)=='+'){
            flag=2;
            index++;
        }
        long ans=0;

        while (index<len){

            if (str.charAt(index)<'0'  || str.charAt(index)>'9'){
                break;
            }else{
                sb.append(str.charAt(index));
            }
            if (sb.length()!=0){
                ans=Long.valueOf(sb.toString());
            }


            if (flag==1){
                ans=ans*-1;
            }
            if (ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if (ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }



            index++;
        }



        return (int) ans;
    }

    public static void main(String[] args) {
        String s="20000000000000000000";
        System.out.println(new _8字符串转整数().myAtoi(s));

    }
}
