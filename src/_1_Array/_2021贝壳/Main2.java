package _1_Array._2021贝壳;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-07 15:17
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int max = 0;
        int flag = 1;
        for (int i = n / 2; i >= 0; i--) {
            for (int j = 0; j <= n / 2; j++) {
                if ((s.substring(j, j + i) + s.substring(j, j + i)).equals(s.substring(0, 2 * i))) {
                    max = i;
                    flag = 2;
                    break;
                }
            }
            if (flag == 2) {
                break;
            }
        }
        if (max == 0) {
            System.out.println(n);
        } else {
            System.out.println(n - max + 1);
        }

    }


}
