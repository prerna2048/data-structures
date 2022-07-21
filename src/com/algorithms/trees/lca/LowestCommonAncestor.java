package com.algorithms.trees.lca;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;
import com.algorithms.trees.Stack;

import java.util.List;

public class LowestCommonAncestor {


    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        NodePath obj = new NodePath();

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        obj.nodePath(root, p.val, stack1);
        obj.nodePath(root, q.val, stack2);

        List<Node> list1 = stack1.treeNodeList;
        List<Node> list2 = stack2.treeNodeList;
        Node lca = new Node();

        int size = list1.size() <= list2.size() ? list1.size() : list2.size();
        while (size >= 1) {
            Node node1 = stack1.pop();
            Node node2 = stack2.pop();
            if (node1.val == node2.val) {
                return node1;
            }
            --size;

        }

        return null;
    }

    public static void main(String[] args) {
        LowestCommonAncestor obj = new LowestCommonAncestor();
        Node root = CreateTree.createTree();
        System.out.println(obj.lowestCommonAncestor(root, new Node(4), new Node(3)).val);
    }


}
