package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

public class DoublyLinkedListNode<T> {
    T data;
    DoublyLinkedListNode<T> prev;
    DoublyLinkedListNode<T> next;

    DoublyLinkedListNode(T nodeData) {
        this.data = nodeData;
        this.prev = null;
        this.next = null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean hasPrev() {
        return this.prev != null;
    }

    public T getData() {
        return this.data;
    }

    public DoublyLinkedListNode<T> getPrev() {
        return this.prev;
    }

    public DoublyLinkedListNode<T> getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoublyLinkedListNode<T> that = (DoublyLinkedListNode<T>) o;

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
