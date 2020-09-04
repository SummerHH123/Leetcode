package _1_Array.Leetcode;

public class _124二叉树最大路径和 {
    int max=0;
    public int maxPathSum(TreeNode root) {
        if (root==null){
            return 0;
        }
        dfs(root);
        return max;
    }





    public int dfs(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));

        max=Math.max(max,left+right+root.val);

        return root.val+Math.max(left,right);

    }
}
