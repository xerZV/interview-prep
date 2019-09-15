package com.simitchiyski.interviewprep.interviewPreparationKit.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;
    private int size;

    public void add(int data) {
        this.root = this.add(root, data);
        this.size++;
    }

    public boolean contains(int data) {
        return containsNode(this.root, data);
    }

    public void remove(int data) {
        root = remove(root, data);
        this.size--;
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }

    /**
     * IN-Order traversal first visit the left branch, then the root node and finally the right branch
     */
    private String dfsInOrder(String tmp, Node node) {
        if (node != null) {
            return new StringBuilder().append(dfsInOrder(tmp, node.left)).append(node.data).append(' ').append(dfsInOrder(tmp, node.right)).toString();
        }

        return tmp;
    }

    /**
     * PRE-Order traversal first visit the root node, then left branch and finally the right branch
     */
    private String dfsPreOrder(String tmp, Node node) {
        if (node != null) {
            return new StringBuilder().append(' ').append(node.data).append(dfsPreOrder(tmp, node.left)).append(dfsPreOrder(tmp, node.right)).toString();
        }

        return tmp;
    }

    /**
     * POST-Order traversal first visit the left branch, then the right branch and finally the root node
     */
    private String dfsPostOrder(String tmp, Node node) {
        if (node != null) {
            return new StringBuilder().append(dfsPostOrder(tmp, node.left)).append(dfsPostOrder(tmp, node.right)).append(' ').append(node.data).toString();
        }

        return tmp;
    }

    private Node add(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) { // check left branch
            current.left = add(current.left, data);
        } else if (data > current.data) { // check right branch
            current.right = add(current.right, data);
        } else { // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNode(Node current, int data) {
        if (current == null) { // does not contain the data
            return false;
        } else if (data == current.data) { //contains the data
            return true;
        }

        // check in left or right branch
        return data < current.data ? containsNode(current.left, data) : containsNode(current.right, data);
    }

    private Node remove(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {// Found the node which has to be deleted
            if (isLeaf(current)) { // check is leaf
                return null; // return null - it will be assigned to the parent node as a child (null)
            } else if (current.right == null) {
                return current.left; //return the non-null child - it will be assigned to the parent node as a child
            } else if (current.left == null) {
                return current.right; //return the non-null child - it will be assigned to the parent node as a child
            } else { // the current node has two children
                /* If we have a tree like this one
                       3
                      / \
                     2   4
                     And we want to delete 3. We find the smallest, which in this case is 2, and set it in the 3's place
                      after that we delete it from the right subtree, which in this case is leaf and will return null
                 */
                int smallest = findSmallest(current);
                current.data = smallest;
                current.right = remove(current.right, smallest);
                current.left = null;
                return current;
            }
        } else if (data < current.data) {
            current.left = remove(current.left, data);
        } else {
            current.right = remove(current.right, data);
        }

        return current;
    }

    private boolean isLeaf(Node node) {
        if (node == null)
            throw new IllegalArgumentException();

        return node.left == null && node.right == null;
    }

    private int findSmallest(Node node) {
        // In its nature Binary Search Tree keeps the elements < root in the left branch and analogy
        // the elements > root in the right branch. So if the left branch is null, in the right branch there will be
        // only elements > than root, so we are returning the the node.data, else recursively
        // we call the findSmallest with the left branch
        return node.left == null ? node.data : findSmallest(node.left);
    }

    public String toString(TraverseType dfs) {
        switch (dfs) {
            default:
            case DEPTH_FIRST_SEARCH_IN_ORDER:
                return dfsInOrder("", this.root).trim();
            case DEPTH_FIRST_SEARCH_PRE_ORDER:
                return dfsPreOrder("", this.root).trim();
            case DEPTH_FIRST_SEARCH_POST_ORDER:
                return dfsPostOrder("", this.root).trim();
            case BREADTH_FIRST_SEARCH:
                return bfsOrder(this.root).trim();
        }
    }

    /**
     * Visits all the nodes level by level
     */
    public String bfsOrder(Node root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.remove();

            sb.append(' ').append(node);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return toString(TraverseType.DEPTH_FIRST_SEARCH_IN_ORDER);
    }

    public int size() {
        return this.size;
    }

    static enum TraverseType {
        DEPTH_FIRST_SEARCH_IN_ORDER,
        DEPTH_FIRST_SEARCH_PRE_ORDER,
        DEPTH_FIRST_SEARCH_POST_ORDER,
        BREADTH_FIRST_SEARCH;
    }
}
