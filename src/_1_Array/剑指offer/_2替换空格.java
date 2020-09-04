package _1_Array.剑指offer;

public class _2替换空格 {
    public String replaceSpace(StringBuffer str) {
       int len=str.length();
       String red="%20";
       StringBuffer sb=new StringBuffer();
       for (int i= 0;i<len;i++){
           if (str.charAt(i)==' '){
               sb.append(red);
           }else {
               sb.append(str.charAt(i));
           }
       }
       return sb.toString();

    }
}
