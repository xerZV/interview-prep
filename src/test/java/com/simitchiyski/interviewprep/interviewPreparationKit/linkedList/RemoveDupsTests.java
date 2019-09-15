package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.removeDups.RemoveDups.removeDupsBruteForce;
import static com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.removeDups.RemoveDups.removeDupsHashSet;
import static org.junit.Assert.assertEquals;

public class RemoveDupsTests {
    private static final String EXPECTED = "[1, 2, 3, 4, 6, 7, 8, 5, 9]";

    @Test
    public void testRemoveDupsHashSet() {
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>(1, 2, 3, 4, 4, 3, 6, 1, 7, 8, 1, 5, 5, 9, 1, 1, 1);
        removeDupsHashSet(dList);
        assertEquals(EXPECTED, dList.toString());

        dList = new DoublyLinkedList<>(1, 1, 1, 1);
        removeDupsHashSet(dList);
        assertEquals("[1]", dList.toString());

        dList = new DoublyLinkedList<>(1);
        removeDupsHashSet(dList);
        assertEquals("[1]", dList.toString());
    }

    @Test
    public void testRemoveDupsBruteForce() {
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>(1, 2, 3, 4, 4, 3, 6, 1, 7, 8, 1, 5, 5, 9, 1, 1, 1);
        removeDupsBruteForce(dList);
        assertEquals(EXPECTED, dList.toString());

        dList = new DoublyLinkedList<>(1, 1, 1, 1);
        removeDupsBruteForce(dList);
        assertEquals("[1]", dList.toString());

        dList = new DoublyLinkedList<>(1);
        removeDupsBruteForce(dList);
        assertEquals("[1]", dList.toString());
    }
}
