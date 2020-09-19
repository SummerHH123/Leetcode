package _1_Array._2021_vivo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 19:56
 */
public class Main1 {
    public static int[] di_x=new int[]{1,0,-1,0};
    public static int[] di_y=new int[]{0,1,0,-1};
    public static boolean[][] vis;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start_x=sc.nextInt();
        int start_y=sc.nextInt();
        int end_x=sc.nextInt();
        int eend_y=sc.nextInt();

        sc.nextLine();

        char[][] map=new char[n][n];
        for (int i=0;i<n;i++){
                String line=sc.nextLine();
                map[i]=line.toCharArray();
        }
        int step=0;
        bfs(map,start_x,start_y,end_x,eend_y,step);
        System.out.println(step);



    }

    private static int bfs(char[][] map, int start_x, int start_y, int end_x, int end_y,int step) {
        int[][] distance=new int[map.length][map[0].length];
        LinkedList<int[]> queue=new LinkedList<>();
        queue.add(new int[]{start_x,start_y});
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int x=poll[0];
            int y=poll[1];
            if (x==end_x && y==end_y){
                return step;
            }
            for (int i=0;i<4;i++){
                int xx=x+di_x[i];
                int yy=y+di_y[i];
                step+=1;
                if (xx>=0 && yy>=0 && xx<map.length && yy<map[0].length
                && map[xx][yy]!='#' && map[xx][yy]!='@' && !vis[xx][yy]){
                    queue.add(new int[]{xx,yy});
                    vis[xx][yy]=true;
                }
            }
        }
        return -1;

    }


}
