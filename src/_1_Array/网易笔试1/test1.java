package _1_Array.网易笔试1;

import java.util.*;

public class test1 {


    static class Job implements Comparable<Job> {
        int di;
        int pi;

        public Job(int di, int pi) {
            this.di = di;
            this.pi = pi;
        }


        public int compareTo(Job o) {         //根据难度来排序
            return this.di - o.di;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Job[] jobs = new Job[N];
        int[] ai = new int[M];
        for (int i = 0; i < N; i++) {
            jobs[i] = new Job(scanner.nextInt(), scanner.nextInt());
        }
        for (int i = 0; i < M; i++) {
            ai[i] = scanner.nextInt();
        }
        Arrays.sort(jobs);
        for (int i = 1; i < jobs.length; i++) {
            if (jobs[i].pi < jobs[i - 1].pi)
                jobs[i].pi = jobs[i - 1].pi;
        }

        for (int i = 0; i < M; i++) {

            int x = findLastEqualSmaller(jobs, ai[i]);

            if (x == -1) {

                System.out.println(0);
            } else {
                System.out.println(jobs[x].pi);
            }

        }
    }

    // 小于等于key的索引，如果没有，那么返回-1
    static int findLastEqualSmaller(Job[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid].di > key) {
                right = mid - 1;
            } else if (array[mid].di <= key) {
                left = mid + 1;
            } else if (array[mid].di == key){
                left = mid + 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 )
            return -1;
        return right;

    }
}

