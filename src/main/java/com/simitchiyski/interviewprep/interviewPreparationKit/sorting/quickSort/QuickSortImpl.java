package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.quickSort;

public class QuickSortImpl implements QuickSort {
    private static QuickSortImpl instance = null;

    private QuickSortImpl() {
    }

    public static QuickSortImpl getInstance() {
        if (instance == null) {
            instance = new QuickSortImpl();
        }

        return instance;
    }

    @Override
    public void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        sort(array, left, index - 1);
        sort(array, index, right);
    }

    private int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
