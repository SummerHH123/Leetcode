package _1_Array.Leetcode;

public class _108将有序数组转换为二叉搜索树 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0){
            return null;
        }
        TreeNode root=dfs(0,nums.length-1,nums);
        return root;

    }

    private TreeNode dfs(int left, int right,int[] nums) {
        if (left>right){
            return null;
        }
        int mid=(right+left)>>1;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=dfs(left,mid-1,nums);
        node.right=dfs(mid+1,right,nums);
        return node;

    }


    public static void main(String[] args) {
        int[] nums=new int[]{-10,-3,4,5,9};
        TreeNode root=new _108将有序数组转换为二叉搜索树().sortedArrayToBST(nums);
        System.out.println(root.val);

    }
}


