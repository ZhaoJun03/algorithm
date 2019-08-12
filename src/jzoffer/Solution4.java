package jzoffer;


/**
 * 重建二叉树
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输
 * 入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * @author ZhaoJun
 * @date 2019/8/12 15:40
 */

public class Solution4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null) {
            return null;
        }
        TreeNode root = generate(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private TreeNode generate(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int inIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (pre[preStart] == in[i]) {
                inIndex = i;
                break;
            }
        }
        root.left = generate(pre, preStart + 1, preStart + (inIndex - inStart), in, inStart, inIndex - 1);
        root.right = generate(pre, preStart + (inIndex - inStart) + 1, preEnd, in, inIndex + 1, inEnd);
        return root;
    }


    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        TreeNode treeNode = solution4.reConstructBinaryTree(new int[]{1, 2, 4, 3, 5, 6, 8}, new int[]{4, 2, 1, 5, 3, 8, 6});
        System.out.println(treeNode);
    }

    //Definition for binary tree
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
