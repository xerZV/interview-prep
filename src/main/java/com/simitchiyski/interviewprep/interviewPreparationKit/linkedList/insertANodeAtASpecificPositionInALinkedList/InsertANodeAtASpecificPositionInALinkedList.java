package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList;

public class InsertANodeAtASpecificPositionInALinkedList {

    // BruteForce Solution
    public static <T> SinglyLinkedListNode<T> insertNodeAtPosition(SinglyLinkedListNode<T> head, T data, int position) {
        if (position < 0) return head;

        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        if (head == null) {
            return newNode;
        }

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode<T> previous = head;
        SinglyLinkedListNode<T> current = head;

        while (position-- > 0) {
            previous = current;
            current = current.next;
        }

        previous.next = newNode;
        newNode.next = current;

        return head;
    }

    // Solution using recursion
    public static <T> SinglyLinkedListNode<T> insertNodeAtPositionRecursively(SinglyLinkedListNode<T> head, T data, int position) {
        if (position < 0) return head;

        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        if (head == null) {
            return newNode;
        }

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode<T> whereToInsert = insertNodeAtPositionRecursivly(head, position);
        newNode.next = whereToInsert.next;
        whereToInsert.next = newNode;

        return head;
    }

    // recursion helper method
    private static <T> SinglyLinkedListNode<T> insertNodeAtPositionRecursivly(SinglyLinkedListNode<T> head, int position) {
        if (position == 1)
            return head;

        return insertNodeAtPositionRecursivly(head.next, --position);
    }

    /**
     * Print the whole linkedlist
     *
     * @param node - start point
     * @param sep  separator
     * @return sep separated string with all the linkedlist nodes
     */
    public static <T> String printSinglyLinkedList(SinglyLinkedListNode<T> node, final String sep) {
        if (node == null)
            return "[]";

        StringBuilder stringBuilder = new StringBuilder().append('[');
        while (node != null) {
            stringBuilder.append(node.data);

            node = node.next;

            if (node != null) {
                stringBuilder.append(sep);
            }
        }

        return stringBuilder.append(']').toString();
    }
}
