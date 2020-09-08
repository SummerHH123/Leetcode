package _1_Array._01常用;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-08 22:07
 */
public class 正则 {
    public static void main(String[] args) {
        String s="海";
        System.out.println(s.matches("^[A-Za-z0-9\\u4e00-\\u9fa5]+$"));
        //\u4e00-\u9fa5代表汉字
    }
}
