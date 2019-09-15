package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoublyLinkedList(T... vals) {
        if (vals == null)
            throw new IllegalArgumentException();

        if (vals.length == 0) {
            this.head = null;
            this.tail = null;
        } else {
            for (T t : vals) {
                this.add(t);
            }
        }
    }

    public void add(final T nodeData) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(nodeData);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
        this.size++;
    }

    public void insert(final T nodeData, final int index) {
        assertIndexInRange(index);

        DoublyLinkedListNode<T> insertAt = getNodeAtIndex(this.head, index);
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(nodeData);

        if (index == 0) { //insert head
            node.next = this.head;
            this.head = node;
            if (this.tail.prev == null)
                this.tail.prev = this.head;
        } else if (index == this.size - 1) { //insert tail
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        } else { //insert between head and tail
            node.next = insertAt.next;
            insertAt.next.prev = node;
            insertAt.next = node;
            node.prev = insertAt;
        }

        this.size++;
    }

    /**
     * Removes the first occurrence of the specified element from this list
     *
     * @param data
     */
    public boolean remove(final T data) {
        if (this.head.data.equals(data)) {
            this.head = this.head.next;
            if (this.head.next != null)
                this.head.next.prev = null;

            this.size--;
            return true;
        }

        DoublyLinkedListNode<T> current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                if (current.next == null) { //its tail
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                }

                if (current.prev != null) {
                    current.prev.next = current.next;
                }

                current.next.prev = current.prev;

                this.size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void remove(final int index) {
        assertIndexInRange(index);

        if (index == 0) { //insert head
            this.head = this.head.next;
            if (this.head.next != null)
                this.head.next.prev = null;
        } else if (index == this.size - 1) {
            System.out.println("tail=" + this.tail);
            System.out.println("head=" + this.head);
            this.tail = this.tail.prev;
            if (this.tail.next != null)
                this.tail.next = null;
        } else {
            DoublyLinkedListNode<T> current = getNodeAtIndex(this.head, index);

            if (current.prev != null) {
                current.prev.next = current.next;
            }

            current.next.prev = current.prev;
        }

        this.size--;
    }

    private DoublyLinkedListNode<T> getNodeAtIndex(final DoublyLinkedListNode<T> head, int index) {
        if (index <= 1)
            return head;

        return getNodeAtIndex(head.next, --index);
    }

    public int size() {
        return this.size;
    }

    public T getFirst() {
        final DoublyLinkedListNode<T> node = this.head;
        if (node == null)
            throw new NoSuchElementException();
        return node.data;
    }

    public T getLast() {
        final DoublyLinkedListNode<T> node = this.tail;
        if (node == null)
            throw new NoSuchElementException();
        return node.data;
    }

    public DoublyLinkedListNode<T> getHead() {
        final DoublyLinkedListNode<T> node = this.head;

        if (node == null)
            throw new NoSuchElementException();
        return node;
    }

    public DoublyLinkedListNode<T> getTail() {
        final DoublyLinkedListNode<T> node = this.tail;

        if (node == null)
            throw new NoSuchElementException();

        return node;
    }

    private void assertIndexInRange(final int index) {
        if (index < 0 || index >= this.size)
            throw new IllegalArgumentException("Index cannot be negative or >= size");
    }

    public String toString() {
        if (this.head == null)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[').append(this.head);
        DoublyLinkedListNode<T> e = this.head.next;

        if (e == null)
            return sb.append(']').toString();

        while (true) {
            if (e.next == null)
                return sb.append(',').append(' ').append(e).append(']').toString();

            sb.append(',').append(' ').append(e);

            e = e.next;
        }
    }

    public void unlink(DoublyLinkedListNode<T> unlink) {
        if (unlink == null)
            throw new IllegalArgumentException();

        if (unlink == this.head && unlink == this.tail) { // if there is only one element
            this.head = null;
            this.tail = null;
        } else if (unlink == this.head) { // if we have to unlink the head
            this.head = unlink.next;
            this.head.prev = null;
        } else if (unlink == this.tail) { // if we have to unlink the tail
            this.tail = unlink.prev;
            this.tail.next = null;
        } else { // if we have to unlink somewhere between head and tail
            DoublyLinkedListNode prev = unlink.prev;
            DoublyLinkedListNode next = unlink.next;
            prev.next = next;
            next.prev = prev;
        }

        this.size--;
    }
}
