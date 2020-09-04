package _1_Array._01常用.算法.背包01;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            /* 1.读取数据 */

            int number = sc.nextInt(); // 物品的数量
            int capacity = sc.nextInt(); // 背包容量

            // 注意：我们声明数组的长度为"n+1",并另score[0]和time[0]等于0。
            // 从而使得 数组的下标，对应于题目的序号。即score[1]对应于第一题的分数,time[1]对应于第一题的时间
            int[] weight = new int[number + 1]; // {0,2,3,4,5} 每个物品对应的重量
            int[] value = new int[number + 1]; // {0,3,4,5,6} 每个物品对应的价值

            weight[0] = 0;
            for (int i = 1; i < number + 1; i++) {
                weight[i] = sc.nextInt();
            }

            value[0] = 0;
            for (int i = 1; i < number + 1; i++) {
                value[i] = sc.nextInt();
            }



            /* 2.求解01背包问题 */

            int[][] v = new int[number + 1][capacity + 1];// 声明动态规划表.其中v[i][j]对应于：当前有i个物品可选，并且当前背包的容量为j时，我们能得到的最大价值

            // 填动态规划表。当前有i个物品可选，并且当前背包的容量为j。
            for (int i = 0; i < number + 1; i++) {
                for (int j = 0; j < capacity + 1; j++) {
                    if (i == 0) {
                        v[i][j] = 0; // 边界情况：若只有0道题目可以选做，那只能得到0分。所以令V(0,j)=0
                    } else if (j == 0) {
                        v[i][j] = 0; // 边界情况：若只有0分钟的考试时间，那也只能得0分。所以令V(i,0)=0
                    } else {
                        if (j < weight[i]) {
                            v[i][j] = v[i - 1][j];// 包的容量比当前该物品体积小，装不下，此时的价值与前i-1个的价值是一样的，即V(i,j)=V(i-1,j)；
                        } else {
                            v[i][j] = Math.max(v[i - 1][j], v[i - 1][j - weight[i]] + value[i]);// 还有足够的容量可以装当前该物品，但装了当前物品也不一定达到当前最优价值，所以在装与不装之间选择最优的一个，即V(i,j)=max｛V(i-1,j)，V(i-1,j-w(i))+v(i)｝。
                        }
                    }
                }
            }


            System.out.println(v[number][capacity]);// 有number个物品可选，且背包的容量为capacity的情况下，能装入背包的最大价值

        }

    }

}



