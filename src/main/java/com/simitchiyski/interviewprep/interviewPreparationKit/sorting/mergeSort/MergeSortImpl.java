package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.mergeSort;

public class MergeSortImpl implements MergeSort {
    private static MergeSortImpl instance = null;

    private MergeSortImpl() {
    }

    public static MergeSortImpl getInstance() {
        if (instance == null) {
            instance = new MergeSortImpl();
        }

        return instance;
    }

    @Override
    public void sort(int[] array, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;
        sort(array, temp, left, middle);
        sort(array, temp, middle + 1, right);
        mergeHalves(array, temp, left, right);
    }

    private void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }

            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}
