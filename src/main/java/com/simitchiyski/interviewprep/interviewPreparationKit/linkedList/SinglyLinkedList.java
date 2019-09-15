package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import java.util.NoSuchElementException;

/**
 * When you implement the linked list this way, you need to be a bit careful.
 * What if multiple objects need a reference to the linked list, and then the head of the linked list changes?
 * Some objects might still be pointing to the old head.
 *
 * @param <T>
 */
public class SinglyLinkedList<T> {
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(final T nodeData) {
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
        this.size++;
    }

    public void insert(final T nodeData, final int index) {
        assertIndexInRange(index);

        SinglyLinkedListNode<T> nodeBefore = getNodeAtIndex(this.head, index);
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(nodeData);

        if (index == 0) { //insert head
            node.next = this.head;
            this.head = node;
        } else if (index == this.size - 1) { //insert tail
            this.tail.next = node;
            this.tail = node;
        } else { //insert between head and tail
            node.next = nodeBefore.next;
            nodeBefore.next = node;
        }

        this.size++;
    }

    public void remove(final int index) {
        assertIndexInRange(index);

        if (index == 0) { //insert head
            this.head = this.head.next;
        } else {
            SinglyLinkedListNode<T> previous = head, current = head;

            int position = index;
            while (position-- > 0) {
                previous = current;
                current = current.next;
            }

            if (index == this.size - 1) {
                this.tail = previous;
                this.tail.next = null;
            } else {
                previous.next = current.next;
                current = null;
            }
        }

        this.size--;
    }

    /**
     * Removes the first occurrence of the specified element from this list
     *
     * @param data
     */
    public boolean remove(final T data) {
        if (this.head.data.equals(data)) {
            this.head = this.head.next;
            this.size--;
            return true;
        }

        SinglyLinkedListNode<T> previous = head, current = head;

        while (current.next != null) {
            previous = current;
            current = current.next;
            if (current.data.equals(data)) {
                if (current.next == null) //its tail
                    this.tail = previous;

                previous.next = current.next;
                this.size--;
                return true;
            }
        }

        return false;
    }

    private SinglyLinkedListNode<T> getNodeAtIndex(final SinglyLinkedListNode<T> head, int index) {
        if (index <= 1)
            return head;

        return getNodeAtIndex(head.next, --index);
    }

    public int size() {
        return this.size;
    }

    public T getFirst() {
        final SinglyLinkedListNode<T> node = this.head;
        if (node == null)
            throw new NoSuchElementException();
        return node.data;
    }

    public T getLast() {
        final SinglyLinkedListNode<T> node = this.tail;
        if (node == null)
            throw new NoSuchElementException();
        return node.data;
    }

    public SinglyLinkedListNode<T> getHead() {
        final SinglyLinkedListNode<T> node = this.head;

        if (node == null)
            throw new NoSuchElementException();
        return node;
    }

    public SinglyLinkedListNode<T> getTail() {
        final SinglyLinkedListNode<T> node = this.tail;

        if (node == null)
            throw new NoSuchElementException();

        return node;
    }

    private void assertIndexInRange(final int index) {
        if (index < 0 || index >= this.size)
            throw new IllegalArgumentException("Index cannot be negative or >= size");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinglyLinkedList<T> that = (SinglyLinkedList<T>) o;

        if (this.size != that.size) return false;

        SinglyLinkedListNode<T> e = this.head;
        SinglyLinkedListNode<T> t = (SinglyLinkedListNode<T>) that.head;

        while (e != null && t != null) {
            if (!e.equals(t))
                return false;

            e = e.next;
            t = t.next;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        SinglyLinkedListNode<T> e = this.head;
        while (e != null) {
            hashCode = hashCode + e.hashCode();
            e = e.next;
        }

        return hashCode;
    }

    public String toString() {
        if (this.head == null)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[').append(this.head);
        SinglyLinkedListNode<T> e = this.head.next;

        if (e == null)
            return sb.append(']').toString();

        while (true) {
            if (e.next == null)
                return sb.append(',').append(' ').append(e).append(']').toString();

            sb.append(',').append(' ').append(e);

            e = e.next;
        }
    }
}
