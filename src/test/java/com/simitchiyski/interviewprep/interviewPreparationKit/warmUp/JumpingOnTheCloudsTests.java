package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.jumpingOnTheClouds.JumpingOnTheClouds.jumpingOnCloudsBruteForce;
import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.jumpingOnTheClouds.JumpingOnTheClouds.jumpingOnCloudsOptimized;
import static org.junit.Assert.assertEquals;

public class JumpingOnTheCloudsTests {
    @Test
    public void testJumpingOnCloudsBruteForce() {
        assertEquals(4, jumpingOnCloudsBruteForce(new int[]{0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsBruteForce(new int[]{0, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsBruteForce(new int[]{0, 0, 0, 0, 0, 1, 0}));
        assertEquals(4, jumpingOnCloudsBruteForce(new int[]{0, 0, 0, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsBruteForce(new int[]{0, 1, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsBruteForce(new int[]{0, 0, 0, 1, 0, 0}));

        assertEquals(4, jumpingOnCloudsBruteForce(new int[]{0, 0, 0, 1, 0, 0, 1, 0}));
    }

    @Test
    public void testJumpingOnCloudsOptimized() {
        assertEquals(4, jumpingOnCloudsOptimized(new int[]{0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsOptimized(new int[]{0, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsOptimized(new int[]{0, 0, 0, 0, 0, 1, 0}));
        assertEquals(4, jumpingOnCloudsOptimized(new int[]{0, 0, 0, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsOptimized(new int[]{0, 1, 0, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnCloudsOptimized(new int[]{0, 0, 0, 1, 0, 0}));

        assertEquals(4, jumpingOnCloudsOptimized(new int[]{0, 0, 0, 1, 0, 0, 1, 0}));
    }
}
