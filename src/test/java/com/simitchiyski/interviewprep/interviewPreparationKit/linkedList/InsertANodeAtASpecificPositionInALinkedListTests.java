package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import org.junit.Before;
import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList.InsertANodeAtASpecificPositionInALinkedList.*;
import static org.junit.Assert.assertEquals;


public class InsertANodeAtASpecificPositionInALinkedListTests {
    private static final String EXPECTED = "16 13 1 7";
    private static final String WHITESPACE_SEP = " ";
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    private int data;
    private int position;

    @Before
    public void beforeClass() {
        this.singlyLinkedList.insertNode(16);
        this.singlyLinkedList.insertNode(13);
        this.singlyLinkedList.insertNode(7);

        this.data = 1;
        this.position = 2;
    }

    @Test
    public void testInsertNodeAtPositionBruteForce() {
        SinglyLinkedListNode singlyLinkedListNode = insertNodeAtPosition(this.singlyLinkedList.head, this.data, this.position);
        assertEquals(EXPECTED, printSinglyLinkedList(singlyLinkedListNode, WHITESPACE_SEP));
    }

    @Test
    public void testInsertNodeAtPositionRecursively() {
        SinglyLinkedListNode singlyLinkedListNode = insertNodeAtPositionRecursively(this.singlyLinkedList.head, this.data, this.position);
        assertEquals(EXPECTED, printSinglyLinkedList(singlyLinkedListNode, WHITESPACE_SEP));
    }
}
