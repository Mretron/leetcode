package com.zzj.solution.easy.erChaShuDeJingXiangLcof;

import com.zzj.solution.dataStructure.TreeNode;

/**
 * @author zengzhongjie
 * @date 2020/11/28
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
    }
}
