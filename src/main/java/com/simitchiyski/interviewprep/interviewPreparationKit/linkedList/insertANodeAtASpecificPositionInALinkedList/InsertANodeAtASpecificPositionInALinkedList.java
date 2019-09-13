package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList;

public class InsertANodeAtASpecificPositionInALinkedList {

    // BruteForce Solution
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (position < 0) return head;

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode previous = head;
        SinglyLinkedListNode current = head;

        while (position-- > 0) {
            previous = current;
            current = current.next;
        }

        previous.next = newNode;
        newNode.next = current;

        return head;
    }

    // Solution using recursion
    public static SinglyLinkedListNode insertNodeAtPositionRecursively(SinglyLinkedListNode head, int data, int position) {
        if (position < 0) return head;

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode whereToInsert = insertNodeAtPositionRecursivly(head, position);
        newNode.next = whereToInsert.next;
        whereToInsert.next = newNode;

        return head;
    }

    // recursion helper method
    private static SinglyLinkedListNode insertNodeAtPositionRecursivly(SinglyLinkedListNode head, int position) {
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
    public static String printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.data);

            node = node.next;

            if (node != null) {
                stringBuilder.append(sep);
            }
        }

        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    // ======== // ======== //
    //       Classes       //

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}
