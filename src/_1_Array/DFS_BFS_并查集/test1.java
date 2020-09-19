package _1_Array.DFS_BFS_并查集;

import java.util.*;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            int num=sc.nextInt();
            nums.put(i, num);
        }
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            sb.append(s.charAt(0));
            i++;
        }
        for (; i < s.length(); i++) {
            sb.append(nums.get(s.charAt(i) - '0'));
        }


        System.out.println(sb.toString());


    }
}
