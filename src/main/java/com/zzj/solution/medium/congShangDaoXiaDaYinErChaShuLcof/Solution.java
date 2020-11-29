package com.zzj.solution.medium.congShangDaoXiaDaYinErChaShuLcof;

import com.zzj.solution.dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zengzhongjie
 * @date 2020/11/29
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new LinkedList<>();
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if(temp.left != null) {
                queue.offer(temp.left);
            }
            if(temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}
