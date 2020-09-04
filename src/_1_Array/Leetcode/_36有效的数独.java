package _1_Array.Leetcode;

import java.util.HashMap;

public class _36有效的数独 {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] row=new HashMap[9];
        HashMap<Integer,Integer>[] col=new HashMap[9];
        HashMap<Integer,Integer>[] bor=new HashMap[9];

        for (int i=0;i<9;i++){
            row[i]=new HashMap<>();
            col[i]=new HashMap<>();
            bor[i]=new HashMap<>();
        }

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    int n=(int)board[i][j];
                    row[i].put(n,row[i].getOrDefault(n,0)+1);
                    col[j].put(n,col[j].getOrDefault(n,0)+1);

                    int index=(i/3)*3+j/3;
                    bor[index].put(n,bor[index].getOrDefault(n,0)+1);


                    if (row[i].get(n)!=1 || col[j].get(n)!=1 || bor[index].get(n)!=1){
                        return false;
                    }

                }
            }
        }
        return true;


    }
}
