package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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
        if (index < 0 || index >= this.size)
            throw new IllegalArgumentException("Index cannot be negative or >= size");

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

        LinkedList linkedList = new LinkedList();
        linkedList.toString();
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

    public String toString() {
        if (this.head == null)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[').append(this.head);
        SinglyLinkedListNode<T> e = this.head.next;

        while (true) {
            if (e.next == null)
                return sb.append(']').toString();

            sb.append(',').append(' ').append(e);

            e = e.next;
        }
    }
}
