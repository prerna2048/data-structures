package com.algorithms.trees;

  public class Node {
      public int val;
      public Node left;
      public Node right;
      public Node next;
      public Node random;

      public Node() {}

      public Node(int val) {
          this.val = val;
      }

      @Override
      public String toString() {
          final StringBuilder sb = new StringBuilder("Node{");
          sb.append("val=").append(val);
          sb.append('}');
          return sb.toString();
      }
  }