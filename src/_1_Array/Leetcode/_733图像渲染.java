package _1_Array.Leetcode;

import java.util.Arrays;

public class _733图像渲染 {

    public  int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orgin=image[sr][sc];
        dfs(image,sr,sc,orgin,newColor);

        return image;
    }

    static int[] xx=new int[]{0,0,-1,1};
    static int[] yy=new int[]{-1,1,0,0};
    private void dfs(int[][] image, int x, int y, int orgin, int newColor) {

        if (!inArea(image,x,y)){
            return;
        }

        if (image[x][y]!=orgin){
            return;
        }


        image[x][y]=newColor;
        for (int i=0;i<4;i++){
            int newX=x+xx[i];
            int newY=y+yy[i];
            dfs(image,newX,newY,orgin,newColor);
        }
    }

    private boolean inArea(int[][] image, int x, int y) {
       return x>=0 && x<image.length && y>=0 && y<image[0].length;
    }

    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] ints = new _733图像渲染().floodFill(grid, sr, sc, newColor);
        System.out.println(Arrays.deepToString(grid));
    }


}
