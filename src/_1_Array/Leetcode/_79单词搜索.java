package _1_Array.Leetcode;

public class _79单词搜索 {
//    boolean hasFind=false;
    public boolean exist(char[][] board, String word) {

        if (word==null){
            return true;
        }



        boolean[][] visted=new boolean[board.length][board[0].length];

        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (board[i][j]==word.charAt(0)){
                    if (dfs(board,word,i,j,1,visted)){
                        return true;
                    }
//                    if (hasFind){
//                        return true;
//                    }
                }

            }
        }
        return false;
    }
    static int[] xx={0,0,-1,1};
    static int[] yy={-1,1,0,0};
    private boolean dfs(char[][] board, String word, int x, int y, int index, boolean[][] visted) {


        if (index==word.length()
        ){

            return true;
        }
        visted[x][y]=true;
        for (int i=0;i<4;i++){
            int newx=x+xx[i];
            int newy=y+yy[i];
            if (inArea(board,newx,newy) && !visted[newx][newy] && board[newx][newy]==word.charAt(index)){
                if (dfs(board,word,newx,newy,index+1,visted)){
                    return true;
                }
            }
        }
        visted[x][y]=false;
        return false;

    }

    private boolean inArea(char[][] board, int x, int y) {
        if (x>=0 && x<board.length && y>=0 && y<board[0].length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word="ABCCEE";
        System.out.println(new _79单词搜索().exist(board, word));

    }
}
