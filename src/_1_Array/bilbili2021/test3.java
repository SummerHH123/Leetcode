package _1_Array.bilbili2021;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (str.length() < 4) {
            System.out.println(0);
        } else {
            //1. 获取间隔符#
            char sc = str.charAt(0);
            //2. 获取关系符:
            char xc = str.charAt(2);
            //3. 用split(间隔符)得到分离后的字符串数组
            String[] ans = str.substring(4).split(sc + "");

            int ansnum = 0;
            for (String s : ans) {
                if (s.contains(String.valueOf(xc))) ansnum++;
            }
            //行分析
            System.out.println(ansnum);
            if (ansnum > 0) {
                for (String s : ans) {
                    if (s.contains(xc + "")) {//3. 用contains(关系符)检验各个字符串是否标准
                        System.out.println(s.replace(xc, ' '));//4. 用replace(关系符, 空格)输出
                    }
                }
            }
        }
    }
}
