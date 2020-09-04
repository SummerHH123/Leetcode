package _1_Array.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class test2 {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim(i)) count++;
        return count;

    }



    // 判断整数 n 是否是素数
     boolean isPrim(int n) {
        for (int i = 2; i*i < n; i++)
            if (n % i == 0)
                // 有其他整除因子
                return false;
        return true;
    }

    public static void main(String[] args) {

        List<String> li=new ArrayList<>();
        li.add("42567");
        System.out.println(li.get(0));
    }
}
