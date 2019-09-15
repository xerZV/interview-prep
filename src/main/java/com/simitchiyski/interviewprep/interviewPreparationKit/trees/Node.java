package com.simitchiyski.interviewprep.interviewPreparationKit.trees;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return getData() == node.getData();
    }

    @Override
    public int hashCode() {
        return getData();
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
