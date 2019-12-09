package _1_Array.基础;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 桶排序
 * 两个桶  装不对应的数字   一个装实际数字  一个装猜测数字
 * 最后比较两个桶对应位置 输出最小的那个
 */
public class _6_299_猜数字游戏2 {

    public static void main(String[] args) {
        String a = "1123";
        String b = "0111";

        String i = getHint(a, b);
        System.out.println(i);


    }


    public static String getHint(String secret, String guess) {
        int[] a=new int[10];
        int[] b=new int[10];
        int count_a=0;
        int count_b=0;
        for (int i=0;i<secret.length();i++){
            if (secret.charAt(i)==guess.charAt(i)){
                count_a++;
            }else {
                a[secret.charAt(i)-'0']++;
                b[guess.charAt(i)-'0']++;
            }
        }

        for (int i=0;i<a.length;i++){
            count_b+=Math.min(a[i],b[i]);
        }

        return count_a + "A" + count_b + "B";

    }
}
