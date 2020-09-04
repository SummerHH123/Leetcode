package _1_Array.剑指offer;

public class _4重建二叉树 {
    private static int index = 0;

    private static TreeNode solve(int[] pre, int[] temp) {

        int len1 = 0;
        int len2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (pre[index] == temp[i]) {
                break;
            }
            len1++;
        }
        len2 = temp.length - len1 - 1;

        int index1 = 0;
        int index2 = 0;
        int[] inl = new int[len1];
        int[] inr = new int[len2];

        boolean flag = false;
        for (int i = 0; i < temp.length; i++) {
            if (pre[index] == temp[i]) {
                flag = true;
            } else if (!flag) {
                inl[index1++] = temp[i];
            } else {
                inr[index2++] = temp[i];
            }
        }
        TreeNode node = new TreeNode(pre[index]);
//        node.left = null;
//        node.right = null;
        if (index < pre.length && inl.length > 0) {
            index++;
            node.left = solve(pre, inl);
        }
        if (index < pre.length && inr.length > 0) {
            index++;
            node.right = solve(pre, inr);
        }
        return node;

    }
    private static TreeNode reConstructBinaryTree(int[] pre, int[] in) {



        return solve(pre, in);
    }
    public static void main(String[] args) {
        int[] pre = {1, 2, 4,  3, 5, 6}; /// 前序遍历
        int[] in = {4, 2,  1, 5, 3, 6}; /// 中序遍历
        TreeNode root = reConstructBinaryTree(pre, in);

        dfs1(root);
        System.out.println();
        dfs2(root);
        System.out.println();
        dfs3(root);
        System.out.println();

    }
    private static void dfs1(TreeNode node) {
        System.out.printf("%d ", node.val);
        if (node.left != null) {
            dfs1(node.left);
        }
        if (node.right != null) {
            dfs1(node.right);
        }
    }
    private static void dfs3(TreeNode node) {
        if (node.left != null) {
            dfs3(node.left);
        }
        if (node.right != null) {
            dfs3(node.right);
        }
        System.out.printf("%d ", node.val);
    }

    private static void dfs2(TreeNode node) {
        if (node.left != null) {
            dfs2(node.left);
        }
        System.out.printf("%d ", node.val);
        if (node.right != null) {
            dfs2(node.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
