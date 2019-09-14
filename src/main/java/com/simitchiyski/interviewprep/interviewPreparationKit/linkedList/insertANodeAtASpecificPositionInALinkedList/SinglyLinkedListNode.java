package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList;

public class SinglyLinkedListNode<T> {
    public T data;
    public SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
