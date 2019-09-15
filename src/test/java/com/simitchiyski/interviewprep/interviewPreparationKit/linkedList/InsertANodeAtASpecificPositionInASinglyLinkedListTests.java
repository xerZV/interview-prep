package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import org.junit.Before;
import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.insertANodeAtASpecificPositionInALinkedList.InsertANodeAtASpecificPositionInALinkedList.*;
import static org.junit.Assert.*;


public class InsertANodeAtASpecificPositionInASinglyLinkedListTests {
    private static final String EXPECTED = "[16, 13, 1, 7]";
    private static final String EXPECTED1 = "[16, 1, 7]";
    private static final String EXPECTED2 = "[16, 13, 1, 7, 8]";
    private static final String EXPECTED3 = "[16, 13, 88, 1, 7, 8]";
    private static final String EXPECTED4 = "[16, 1]";
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

        assertEquals(EXPECTED, singlyLinkedList.toString());

        SinglyLinkedList<Integer> singlyLinkedListNew = singlyLinkedList;
        assertTrue(singlyLinkedList.equals(singlyLinkedListNew));


        singlyLinkedListNew = new SinglyLinkedList<>();
        singlyLinkedListNew.add(13);
        singlyLinkedListNew.add(1);
        singlyLinkedListNew.add(7);
        singlyLinkedListNew.insert(16, 0);
        assertEquals(Integer.valueOf(singlyLinkedList.hashCode()), Integer.valueOf(singlyLinkedListNew.hashCode()));

        singlyLinkedListNew.add(105);
        assertFalse(singlyLinkedList.equals(singlyLinkedListNew));

        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();
        assertFalse(singlyLinkedList.equals(stringList));

        singlyLinkedList.insert(8, singlyLinkedList.size() - 1); //insert tail
        assertEquals(EXPECTED2, singlyLinkedList.toString());

        singlyLinkedList.insert(88, 2);
        assertEquals(EXPECTED3, singlyLinkedList.toString());

        singlyLinkedList.remove(2); //remove in the middle
        assertEquals(EXPECTED2, singlyLinkedList.toString());

        singlyLinkedList.remove(singlyLinkedList.size() - 1); //remove last
        assertEquals(EXPECTED, singlyLinkedList.toString());

        singlyLinkedList.remove(Integer.valueOf(13));
        assertEquals(EXPECTED1, singlyLinkedList.toString());

        singlyLinkedList.remove(Integer.valueOf(7)); //remove last
        assertEquals(EXPECTED4, singlyLinkedList.toString());
        assertEquals(Integer.valueOf(16), singlyLinkedList.getFirst());
        assertEquals(Integer.valueOf(1), singlyLinkedList.getLast());

        singlyLinkedList.remove(Integer.valueOf(16)); //remove first
        assertEquals(Integer.valueOf(1), singlyLinkedList.getFirst());
        assertEquals(Integer.valueOf(1), singlyLinkedList.getLast());

        singlyLinkedList.insert(16, 0);
        assertEquals(EXPECTED4, singlyLinkedList.toString());

        singlyLinkedList.remove(Integer.valueOf(1)); //remove last, when the elements are only 2
        assertEquals(Integer.valueOf(16), singlyLinkedList.getFirst());
        assertEquals(Integer.valueOf(16), singlyLinkedList.getLast());
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
