package com.algorithms.trees.symmetric;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

public class SymmetricTreeRecursive {


    public boolean isSymmetric(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        else if(node1 == null || node2 == null){
            return false;
        }
        else if (node1.val != node2.val) {
            return false;
        }
        boolean flag1 = isSymmetric(node1.left, node2.right);
        boolean flag2 = isSymmetric(node1.right, node2.left);
        return flag1 && flag2;
    }


    public static void main(String[] args) {
        Node treeNode = CreateTree.createTree();
        SymmetricTreeRecursive obj = new SymmetricTreeRecursive();
        System.out.println(obj.isSymmetric(treeNode, treeNode));
    }
}
