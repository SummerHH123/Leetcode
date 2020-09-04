package _1_Array.Leetcode;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test1 {

    // 方法 1 最简单的 BFS
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        int[] inDegrees = new int[numCourses];
        // 建立入度表
        for (int[] p : prerequisites) {
            inDegrees[p[0]]++;
        }
        // 入度为0的节点队列
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) queue.offer(i);
        }
        int count = 0;  // 记录可以学完的课程数量
        int[] res = new int[numCourses];  // 可以学完的课程
        while (!queue.isEmpty()){
            int curr = queue.poll();
            res[count++] = curr;
            for (int[] p : prerequisites) {
                if (p[1] == curr){
                    inDegrees[p[0]]--;
                    if (inDegrees[p[0]] == 0) queue.offer(p[0]);
                }
            }
        }
        if (count == numCourses) return res;
        return new int[0];
    }




    public static void main(String[] args) {

//        HashMap <String,Integer> map=new HashMap<>();
//        String s1="szt";
//        String s2=new String("szt");
//        map.put(s1,2);
//        System.out.println(map.get(s2));

//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list);
//
//        int numcourse=2;
//        int[][] prerequisites=new int[][]{};
//        System.out.println(Arrays.toString(new _课程表2().findOrder(numcourse, prerequisites)));

//        System.out.println(Math.pow(2, 16)/1024);
//        System.out.println("dad"+12);
//        System.out.println(Math.pow(2,7));
//        ExecutorService es= Executors.newCachedThreadPool();
//        String s=" sdw3 dsfs ";
//
//        System.out.println(s);
//        System.out.println(0.01+0.09);
//
//        List<String> list = new ArrayList<String>();
//        list.add("张三1");
//        list.add("张三2");
//        list.add("张三3");
//        list.add("张三4");
//        list.add("张三5");
//
//        //使用迭代器遍历ArrayList集合
//        Iterator<String> listIt = list.iterator();
//        while(listIt.hasNext()){
//            Object obj = listIt.next();
//            System.out.println(obj);
//            if(obj.equals("张三3")){
//                list.remove("张三3");
//            }
//        }
//
//        for (String str:list){
//            System.out.println(str);
//        }
        int[] a=new int[]{1,2,3};
        System.out.println(a[0]);
        Queue<TreeNode> queue = new LinkedList<>();

        


    }
}
