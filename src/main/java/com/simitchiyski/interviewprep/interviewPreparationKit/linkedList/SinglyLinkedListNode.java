package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

public class SinglyLinkedListNode<T> {
    public T data;
    public SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinglyLinkedListNode<T> that = (SinglyLinkedListNode<T>) o;

        return data.equals(that.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
