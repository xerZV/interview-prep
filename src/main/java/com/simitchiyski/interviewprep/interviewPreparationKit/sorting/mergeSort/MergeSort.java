package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.mergeSort;

public interface MergeSort {
    static void sort(int[] array) {
        MergeSortImpl.getInstance().sort(array, new int[array.length], 0, array.length - 1);
    }

    void sort(int[] array, int[] temp, int left, int right);
}
