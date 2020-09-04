package _1_Array.剑指offer.二叉树;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class 判断平衡二叉树 {

    public boolean isBalanced(TreeNode1 root) {
        if (root == null) {
            return true;
        }
        if (getHeight(root) != -1) {
            return false;
        }
        return true;

    }

    public int getHeight(TreeNode1 root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        //先左右   在计算


        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        String s;
        int[] a=new int[3];
        System.out.println();


        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

class TreeNode1 {
    int val;

    public TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1 left;
    TreeNode1 right;


}
