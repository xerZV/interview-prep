package com.simitchiyski.interviewprep.interviewPreparationKit.search.binarySearch;

public interface BinarySearch {
    static BinarySearchImpl search(final int searchedNumber) {
        return new BinarySearchImpl(searchedNumber);
    }

    int in(int[] data);
}
