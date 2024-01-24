package com.design_pattern.behavioral.iterator;

import java.util.Iterator;
import java.util.Stack;

// Node class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


// BinaryTree class representing the binary tree
class BinaryTree implements Iterable<TreeNode> {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    // Inner class representing the in-order iterator
    private class InOrderIterator implements Iterator<TreeNode> {
        private Stack<TreeNode> stack;

        public InOrderIterator() {
            stack = new Stack<>();
            pushLeftChildren(root);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public TreeNode next() {
            TreeNode current = stack.pop();
            pushLeftChildren(current.right);
            return current;
        }

        private void pushLeftChildren(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }

    @Override
    public Iterator<TreeNode> iterator() {
        return new InOrderIterator();
    }
}


public class Main {
    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        BinaryTree binaryTree = new BinaryTree(root);

        // Use the iterator to traverse the binary tree in-order
        Iterator<TreeNode> iterator = binaryTree.iterator();
        iterator.forEachRemaining((node) -> {
            System.out.println(node.data);
        });
        for (var node : binaryTree) {
            System.out.println(node);
        }
    }
}
