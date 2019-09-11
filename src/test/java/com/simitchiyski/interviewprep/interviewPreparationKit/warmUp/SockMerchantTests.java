package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.SockMerchant.sockMerchantWithMap;
import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.SockMerchant.sockMerchantWithSet;
import static org.junit.Assert.assertEquals;

public class SockMerchantTests {

    static int n;
    static int[] ar;

    @BeforeClass
    public static void beforeClass(){
        n = 9;
        ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
    }

    @Test
    public void testSockMerchantWithSet() {
        assertEquals(3, sockMerchantWithSet(n, ar));
    }

    @Test
    public void testSockMerchantWithMap() {
        assertEquals(3, sockMerchantWithMap(n, ar));
    }
}
