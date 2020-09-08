package _1_Array._2021小米;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-08 18:55
 */
public class Main2 {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        char[][] c={{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        System.out.println(isExist(c, s));

    }

    private static boolean isExist(char[][] board, String word) {
        if (word.length() == 0){
            return false;
        }
        boolean[][] visted=new boolean[board.length][board[0].length];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (word.charAt(0)==board[i][j] && dfs(i,j,0,word,visted,board)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int i, int j, int idx, String word, boolean[][] visted, char[][] board) {
        if (idx==word.length()){
            return true;
        }
        if (i>=board.length || i<0 || j>=board[0].length || j<0 || board[i][j]!=word.charAt(idx) || visted[i][j]){
            return false;
        }
        visted[i][j]=true;
        if (dfs(i+1,j,idx+1,word,visted,board) || dfs(i-1,j,idx+1,word,visted,board) || dfs(i,j+1,idx+1,word,visted,board)
        || dfs(i,j-1,idx+1,word,visted,board)){
            return true;
        }
        visted[i][j]=false;
        return false;
    }
}
