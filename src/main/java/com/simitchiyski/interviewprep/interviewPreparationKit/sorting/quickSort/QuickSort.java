package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.quickSort;

public interface QuickSort {
    static void sort(int[] array) {
        QuickSortImpl.getInstance().sort(array, 0, array.length - 1);
    }

    void sort(int[] array, int left, int right);
}
