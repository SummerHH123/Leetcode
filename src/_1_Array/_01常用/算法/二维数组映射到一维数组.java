package _1_Array._01常用.算法;

public class 二维数组映射到一维数组 {

    // 将二维数组的每个元素映射到一位数组的下标位置
    private int getIndex(int row, int col, int colNum) {
        return row * colNum + col;
    }
}
