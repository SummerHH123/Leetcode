##二维数组的查找
###方法一：
通过暴力循环  时间复杂度o（m*n）
###方法二（右上角）：
利用递增的性质
设置一个i，j 代表当前位置，如果array[i][j]>target的话，就往左走i--
反之就往下走j++  时间复杂度o（n+m）

##从尾到头打印链表
###方法一：通过栈
###方法二：通过递归


##重建二叉树
###方法一：前序和中序，遍历前序，前序的每一个节点 都是根节点 在中序中查找，分为左右子树，递归实现