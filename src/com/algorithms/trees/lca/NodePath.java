package com.algorithms.trees.lca;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;
import com.algorithms.trees.Stack;

public class NodePath {



    public Node nodePath(Node root, int nodeVal, Stack stack) {
        if (root == null) {
            return null;
        }

        if (stack.isPresentNodeVal(nodeVal)) {
            int size = stack.treeNodeList.size();
            return stack.treeNodeList.get(size - 1);
        }
        stack.push(root);


        Node leftNode = nodePath(root.left, nodeVal, stack);
        if (leftNode != null && leftNode.val != nodeVal) {
            stack.pop();
        }
        Node rightNode = nodePath(root.right, nodeVal, stack);
        if (rightNode != null && rightNode.val != nodeVal) {
            stack.pop();
        }
        if (stack.isPresentNodeVal(nodeVal)) {
            int size = stack.treeNodeList.size();
            return stack.treeNodeList.get(size - 1);
        } // can refactor here, returning node finally instead of root.
        // doesnt look good.
        return root;
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        NodePath obj = new NodePath();

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        obj.nodePath(root, 4,stack1);
        obj.nodePath(root, 3,stack2);
        for(Node node: stack1.treeNodeList){
            System.out.println(node);
        }
        for(Node node: stack2.treeNodeList){
            System.out.println(node);
        }
    }
}
