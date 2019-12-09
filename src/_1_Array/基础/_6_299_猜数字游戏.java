package _1_Array.基础;

import java.util.*;

/**
 * 用list存储 猜的字符中不对应的数字
 * 用map存储  答案字符中不对应的数字
 *
 * 遍历list
 * 如果能够在map里找到有一样数字 则b++
 * map--
 */
public class _6_299_猜数字游戏 {
    public static void main(String[] args) {
        String a = "1807";
        String b = "7810";

        String i = getHint(a, b);
        System.out.println(i);

    }

    public static String getHint(String secret, String guess) {
        List<Character> li = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();
        int count_a = 0;
        int count_b = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                count_a++;
            } else {
                li.add(guess.charAt(i));
                if (mp.containsKey(secret.charAt(i))) {
                    mp.put(secret.charAt(i), mp.get(secret.charAt(i)) + 1);
                } else {
                    mp.put(secret.charAt(i), 1);
                }
            }
        }

        for (int i = 0; i < li.size(); i++) {
            if (mp.containsKey(li.get(i))) {
                count_b++;
                mp.put(li.get(i), mp.get(li.get(i)) - 1);
                if (mp.get(li.get(i)) == 0) {
                    mp.remove(li.get(i));
                }
            }
        }

        return count_a + "A" + count_b + "B";


    }
}
