package _1_Array.Leetcode;



public class _100相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }
        if (p==null || q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        boolean flag1=isSameTree(p.left,q.left);
        boolean flag2=isSameTree(p.right,q.right);
        return flag1&&flag2;

    }
}

class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
