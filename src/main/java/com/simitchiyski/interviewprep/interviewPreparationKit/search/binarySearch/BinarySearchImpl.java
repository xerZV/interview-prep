package com.simitchiyski.interviewprep.interviewPreparationKit.search.binarySearch;

public class BinarySearchImpl implements BinarySearch {
    private int searchedElement;

    private BinarySearchImpl() {
        super();
    }

    BinarySearchImpl(int searchedElement) {
        super();
        this.searchedElement = searchedElement;
    }

    @Override
    public int in(final int[] data) {
        checkData(data);

        return binarySearch(data, this.searchedElement);
    }

    private int binarySearch(final int data[], final int searchedNumber) {
        return binarySearch(data, 0, data.length - 1, searchedNumber);
    }

    /**
     * Returns index of searchedNumber if it is present in data[startIndex..endIndex], else return -1
     *
     * @param data           to search in
     * @param startIndex
     * @param endIndex
     * @param searchedNumber
     * @return searchedNumber's index if present, else -1
     */
    private int binarySearch(final int data[], final int startIndex, final int endIndex, final int searchedNumber) {
        if (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            // First thing first check if the searched number is the middle element
            if (data[mid] == searchedNumber)
                return mid;

            // If the searched number is smaller than mid, then it can only be present in left subarray (if the array is sorted)
            if (data[mid] > searchedNumber)
                return binarySearch(data, startIndex, mid - 1, searchedNumber);

            // Else the element can only be present in right subarray (if the array is sorted)
            return binarySearch(data, mid + 1, endIndex, searchedNumber);
        }

        return -1;
    }

    private void checkData(final int data[]) {
        if (data == null || data.length == 0)
            throw new IllegalArgumentException();
    }

    /**
     * Original Java's implementation
     */
//    public int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
//        int low = fromIndex;
//        int high = toIndex - 1;
//
//        while (low <= high) {
//            int mid = (low + high) >>> 1;
//            int midVal = a[mid];
//
//            if (midVal < key)
//                low = mid + 1;
//            else if (midVal > key)
//                high = mid - 1;
//            else
//                return mid; // key found
//        }
//        return -(low + 1);  // key not found.
//    }
}
