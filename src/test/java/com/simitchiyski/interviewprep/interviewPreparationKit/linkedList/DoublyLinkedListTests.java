package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList;

import org.junit.Test;

public class DoublyLinkedListTests {
    @Test
    public void testDoublyLinkedList() {
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>();
        dList.add(1);
        dList.add(2);
        dList.add(3);
        dList.add(4);
        System.out.println(dList);

        dList.remove(Integer.valueOf(1));
        System.out.println(dList);

        dList.remove(Integer.valueOf(2));
        System.out.println(dList);

        dList.remove(Integer.valueOf(3));
        System.out.println(dList);
        System.out.println(dList.getFirst());
        System.out.println(dList.getLast());

        dList.insert(1, 0);
        System.out.println(dList);

        dList.remove(1);
        System.out.println(dList);
        System.out.println(dList.getFirst());
        System.out.println(dList.getLast());

        dList.add(4);
        System.out.println(dList);
        System.out.println(dList.getFirst());
        System.out.println(dList.getLast());

        dList.remove(0);
        System.out.println(dList);
        System.out.println(dList.getFirst());
        System.out.println(dList.getLast());
    }
}
