package com.algorithms.trees.traversal;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Queue;
import com.algorithms.trees.Node;

import java.util.*;

//LevelOrderTraversal
public class BreadthFirstSearch {
    List<List<Integer>> outputList = new ArrayList<>();
    com.algorithms.trees.Queue queue = new Queue();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            outputList = Collections.EMPTY_LIST;
            return outputList;
        }
        queue.push(root);
        outputList.add(Arrays.asList(root.val));
        int count = 1;
        int count2 = 0;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            count2 = 0;
            while (count != 0) {
                Node treeNode = queue.pop();
                count--;
                if (Objects.nonNull(treeNode) &&
                        Objects.nonNull(treeNode.left)) {
                    list.add(treeNode.left.val);
                    queue.push(treeNode.left);
                    count2++;
                }
                if (Objects.nonNull(treeNode) &&
                        Objects.nonNull(treeNode.right)) {
                    list.add(treeNode.right.val);
                    queue.push(treeNode.right);
                    count2++;
                }
            }
            if (!list.isEmpty()) {
                outputList.add(list);
            }
            count = count2;
        }


        return outputList;
    }

    public static void main(String[] args) {
        Node treeNode = CreateTree.createTree();
        BreadthFirstSearch obj = new BreadthFirstSearch();
        obj.levelOrder(treeNode);
        obj.outputList.forEach(System.out::println);
    }
}
