package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList.SinglyLinkedList;
import com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList.SinglyLinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList.InsertANodeAtASpecificPositionInALinkedList.*;
import static org.junit.Assert.assertEquals;


public class InsertANodeAtASpecificPositionInALinkedListTests {
    private static final String EXPECTED = "[16, 13, 1, 7]";
    private static final String EXPECTED2 = "[16, 13, 1, 7, 8]";
    private static final String EXPECTED3 = "[16, 13, 88, 1, 7, 8]";
    private static final String WHITESPACE_SEP = " ";
    private static final String COMMA_WHITESPACE_SEP = ", ";
    private SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    private int data;
    private int position;

    @Before
    public void beforeClass() {
        this.singlyLinkedList.add(16);
        this.singlyLinkedList.add(13);
        this.singlyLinkedList.add(7);

        this.data = 1;
        this.position = 2;
    }

    @Test
    public void testSinglyLinkedListInsert() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

        singlyLinkedList.add(13);
        singlyLinkedList.add(1);
        singlyLinkedList.add(7);
        singlyLinkedList.insert(16, 0);

        assertEquals(EXPECTED, singlyLinkedList);

        singlyLinkedList.insert(8, singlyLinkedList.size() - 1);
        assertEquals(EXPECTED2, singlyLinkedList);

        singlyLinkedList.insert(88, 2);
        assertEquals(EXPECTED3, singlyLinkedList);

        System.out.println(singlyLinkedList);
    }

    @Test
    public void testInsertNodeAtPositionBruteForce() {
        SinglyLinkedListNode<Integer> singlyLinkedListNode = insertNodeAtPosition(this.singlyLinkedList.getHead(), this.data, this.position);
        assertEquals(EXPECTED, printSinglyLinkedList(singlyLinkedListNode, COMMA_WHITESPACE_SEP));
    }

    @Test
    public void testInsertNodeAtPositionRecursively() {
        SinglyLinkedListNode<Integer> singlyLinkedListNode = insertNodeAtPositionRecursively(this.singlyLinkedList.getHead(), this.data, this.position);
        assertEquals(EXPECTED, printSinglyLinkedList(singlyLinkedListNode, COMMA_WHITESPACE_SEP));
    }
}
