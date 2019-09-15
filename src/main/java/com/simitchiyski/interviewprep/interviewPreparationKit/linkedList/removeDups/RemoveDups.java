package com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.removeDups;

import com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.DoublyLinkedList;
import com.simitchiyski.interviewprep.interviewPreparationKit.linkedList.DoublyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    // time complexity - O(N), but we have space complexity O(N) too
    public static <T> void removeDupsHashSet(DoublyLinkedList<T> dList) {
        Set<T> met = new HashSet<>();

        DoublyLinkedListNode<T> runner = dList.getHead();
        while (runner != null) {
            if (met.contains(runner.getData())) {
                DoublyLinkedListNode<T> tmp = runner.getNext();
                dList.unlink(runner);
                runner = tmp;
            } else {
                met.add(runner.getData());
                runner = runner.getNext();
            }
        }
    }

    // Without extra space, we are doing it with time complexity O(N^2)
    public static <T> void removeDupsBruteForce(DoublyLinkedList<T> dList) {
        DoublyLinkedListNode<T> current = dList.getHead();
        while (current != null) {
            DoublyLinkedListNode<T> runner = current;
            while (runner != null) { // Remove all future nodes that have the same value
                if (!runner.hasNext()) {
                    if (current != runner && runner.getData().equals(current.getData()))
                        dList.unlink(runner);
                    break;
                }

                if (runner.getNext().getData() == current.getData()) {
                    DoublyLinkedListNode<T> tmp = null;
                    if (runner.getNext().hasNext()) {
                        tmp = runner.getNext().getNext();
                        dList.unlink(runner.getNext());
                    } else {
                        tmp = runner.getNext();
                        dList.unlink(runner);
                    }

                    runner = tmp;
                } else {
                    runner = runner.getNext();
                }
            }
            current = current.getNext();
        }
    }
}
