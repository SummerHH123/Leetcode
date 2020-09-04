package _1_Array.剑指offer;

public class _1二维数组中的查找 {
//    public boolean Find(int target, int[][] array) {
//
//        for (int i=0;i<array.length;i++){
//            for (int j=0;j<array.length;i++){
//                if (array[i][j]==target)
//                    return true;
//            }
//        }
//        return false;
//    }
    public boolean Find(int target, int[][] array){

//        右上角具有唯一性
        int i=0;
        int j=array[0].length-1;
        while (i>=0&&i<array.length&&j>=0&&j<array[0].length){
            if (array[i][j]==target){
                return true;
            }else if (array[i][j]>target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }


}
