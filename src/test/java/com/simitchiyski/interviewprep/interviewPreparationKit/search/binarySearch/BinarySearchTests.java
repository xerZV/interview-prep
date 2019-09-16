package com.simitchiyski.interviewprep.interviewPreparationKit.search.binarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTests {
    @Test
    public void testBinarySearch() {
        //           0  1  2   3  4   5   6   7   8   9   10  11  12  13  14   15    16    17      18       19         20
        int arr[] = {2, 3, 4, 10, 40, 41, 43, 55, 56, 77, 78, 88, 89, 90, 111, 112, 1134, 13334, 141344, 123123123, 1231231234};
        int searchedNumber = 13334;

        assertEquals(Integer.valueOf(17), Integer.valueOf(BinarySearch.search(searchedNumber).in(arr)));

        searchedNumber = 3;
        assertEquals(Integer.valueOf(1), Integer.valueOf(BinarySearch.search(searchedNumber).in(arr)));

        searchedNumber = -99;
        assertEquals(Integer.valueOf(-1), Integer.valueOf(BinarySearch.search(searchedNumber).in(arr)));
    }
}
